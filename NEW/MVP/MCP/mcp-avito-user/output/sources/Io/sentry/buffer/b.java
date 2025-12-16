package io.sentry.buffer;

import io.sentry.event.Event;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: DiskBuffer.java */
/* loaded from: classes8.dex */
public class b implements io.sentry.buffer.a {

    /* renamed from: c, reason: collision with root package name */
    public static final org.slf4j.a f405069c = org.slf4j.b.d(b.class);

    /* renamed from: a, reason: collision with root package name */
    public final int f405070a;

    /* renamed from: b, reason: collision with root package name */
    public final File f405071b;

    /* compiled from: DiskBuffer.java */
    public class a implements Iterator<Event> {

        /* renamed from: b, reason: collision with root package name */
        public Event f405072b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f405073c;

        public a(Iterator it) {
            this.f405073c = it;
            this.f405072b = b.c(b.this, it);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f405072b != null;
        }

        @Override // java.util.Iterator
        public final Event next() {
            Event event = this.f405072b;
            this.f405072b = b.c(b.this, this.f405073c);
            return event;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public b(File file, int i12) {
        this.f405071b = file;
        this.f405070a = i12;
        String str = "Could not create or write to disk buffer dir: " + file.getAbsolutePath();
        try {
            file.mkdirs();
            if (!file.isDirectory() || !file.canWrite()) {
                throw new RuntimeException(str);
            }
            f405069c.debug(Integer.toString(d()) + " stored events found in dir: " + file.getAbsolutePath());
        } catch (Exception e12) {
            throw new RuntimeException(str, e12);
        }
    }

    public static Event c(b bVar, Iterator it) throws IOException {
        Event event;
        bVar.getClass();
        while (true) {
            event = null;
            if (!it.hasNext()) {
                break;
            }
            File file = (File) it.next();
            if (file.getAbsolutePath().endsWith(".sentry-event")) {
                org.slf4j.a aVar = f405069c;
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(file.getAbsolutePath()));
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            Object object = objectInputStream.readObject();
                            objectInputStream.close();
                            fileInputStream.close();
                            try {
                                event = (Event) object;
                            } catch (Exception e12) {
                                aVar.l("Error casting Object to Event: " + file.getAbsolutePath(), e12);
                                if (!file.delete()) {
                                    aVar.f("Failed to delete Event: " + file.getAbsolutePath());
                                }
                            }
                        } finally {
                            try {
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th5) {
                                th3.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                } catch (FileNotFoundException unused) {
                } catch (Exception e13) {
                    aVar.l("Error reading Event file: " + file.getAbsolutePath(), e13);
                    if (!file.delete()) {
                        aVar.f("Failed to delete Event: " + file.getAbsolutePath());
                    }
                }
                if (event != null) {
                    break;
                }
            }
        }
        return event;
    }

    @Override // io.sentry.buffer.a
    public final void a(Event event) throws IOException {
        int iD2 = d();
        int i12 = this.f405070a;
        org.slf4j.a aVar = f405069c;
        if (iD2 >= i12) {
            aVar.f("Not adding Event because at least " + Integer.toString(i12) + " events are already stored: " + event.f405166b);
            return;
        }
        File file = this.f405071b;
        File file2 = new File(file.getAbsolutePath(), event.f405166b.toString() + ".sentry-event");
        if (file2.exists()) {
            aVar.e("Not adding Event to offline storage because it already exists: " + file2.getAbsolutePath());
            return;
        }
        aVar.debug("Adding Event to offline storage: " + file2.getAbsolutePath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(event);
                    objectOutputStream.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e12) {
            aVar.l("Error writing Event to offline storage: " + event.f405166b, e12);
        }
        aVar.debug(Integer.toString(d()) + " stored events are now in dir: " + file.getAbsolutePath());
    }

    @Override // io.sentry.buffer.a
    public final void b(Event event) {
        File file = new File(this.f405071b, event.f405166b.toString() + ".sentry-event");
        if (file.exists()) {
            String str = "Discarding Event from offline storage: " + file.getAbsolutePath();
            org.slf4j.a aVar = f405069c;
            aVar.debug(str);
            if (file.delete()) {
                return;
            }
            aVar.f("Failed to delete Event: " + file.getAbsolutePath());
        }
    }

    public final int d() {
        int i12 = 0;
        for (File file : this.f405071b.listFiles()) {
            if (file.getAbsolutePath().endsWith(".sentry-event")) {
                i12++;
            }
        }
        return i12;
    }

    @Override // io.sentry.buffer.a
    public final Iterator<Event> getEvents() {
        return new a(Arrays.asList(this.f405071b.listFiles()).iterator());
    }
}
