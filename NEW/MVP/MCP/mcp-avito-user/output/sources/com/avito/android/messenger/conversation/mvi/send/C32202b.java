package com.avito.android.messenger.conversation.mvi.send;

import android.content.Context;
import android.net.Uri;
import com.avito.android.util.C35836l1;
import com.avito.android.util.V2;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MessengerPhotoStorage.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/b;", "Lcom/avito/android/messenger/conversation/mvi/send/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32202b implements InterfaceC32200a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f194476a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final File f194477b;

    /* renamed from: c, reason: collision with root package name */
    public final File f194478c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f194479d = C42727D.c(new a());

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f194480e = C42727D.c(new C5751b());

    /* compiled from: MessengerPhotoStorage.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<File> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            C32202b c32202b = C32202b.this;
            if (c32202b.f194477b == null) {
                return null;
            }
            File file = new File(c32202b.f194477b, "photos/messenger");
            C35836l1.a(file);
            return file;
        }
    }

    /* compiled from: MessengerPhotoStorage.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.b$b, reason: collision with other inner class name */
    public static final class C5751b extends kotlin.jvm.internal.N implements Y41.a<File> {
        public C5751b() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File file = new File(C32202b.this.f194478c, "photos/messenger");
            C35836l1.a(file);
            return file;
        }
    }

    @Inject
    public C32202b(@Y61.k Context context) {
        this.f194476a = context;
        this.f194477b = context.getExternalFilesDir(null);
        this.f194478c = context.getFilesDir();
    }

    public static void e(File file, long j12) {
        V2.f318762a.c("MessengerPhotoStorage", "Deleting files in " + file.getAbsolutePath() + " that modified before " + j12, null);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.lastModified() < j12) {
                    arrayList.add(file2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file3 = (File) it.next();
                file3.delete();
                V2.f318762a.i("MessengerPhotoStorage", "Deleted an old file: " + file3.getAbsolutePath(), null);
            }
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a
    public final void a(long j12) {
        File file = (File) this.f194479d.getValue();
        if (file != null) {
            e(file, j12);
        }
        e((File) this.f194480e.getValue(), j12);
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a
    public final void b(@Y61.k Uri uri) {
        String path;
        if (kotlin.jvm.internal.L.f(uri.getScheme(), "file")) {
            String authority = uri.getAuthority();
            if ((authority == null || authority.length() == 0) && (path = uri.getPath()) != null && path.length() != 0 && uri.getQuery() == null && uri.getFragment() == null) {
                String path2 = uri.getPath();
                if (path2 == null) {
                    path2 = "";
                }
                if (C43066x.q(path2, "/photos/messenger/", false)) {
                    boolean zDelete = new File(URI.create(uri.toString())).delete();
                    V2.f318762a.i("MessengerPhotoStorage", uri + " deleted = " + zDelete, null);
                }
            }
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a
    public final boolean c(@Y61.k Uri uri) {
        if (!kotlin.jvm.internal.L.f(uri.getScheme(), "file")) {
            return false;
        }
        String authority = uri.getAuthority();
        if (authority != null && authority.length() != 0) {
            return false;
        }
        String path = uri.getPath();
        if ((path == null || path.length() == 0) || uri.getQuery() != null || uri.getFragment() != null) {
            return false;
        }
        try {
            return new File(URI.create(uri.toString())).exists();
        } catch (Exception e12) {
            V2.f318762a.c("MessengerPhotoStorage", "Couldn't resolve file by uri: " + uri, e12);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[Catch: Exception -> 0x007b, TryCatch #1 {Exception -> 0x007b, blocks: (B:3:0x0005, B:5:0x000f, B:11:0x0021, B:13:0x002f, B:18:0x0046, B:31:0x0059, B:29:0x0055, B:30:0x0058, B:32:0x0076, B:10:0x0019, B:27:0x0053, B:15:0x003b, B:17:0x0043, B:25:0x004f, B:26:0x0052), top: B:38:0x0005, inners: #0, #2 }] */
    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri d(@Y61.k android.net.Uri r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "MessengerPhotoStorage"
            java.lang.String r1 = "Content of "
            r2 = 0
            kotlin.C r3 = r6.f194479d     // Catch: java.lang.Exception -> L7b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Exception -> L7b
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Exception -> L7b
            if (r3 == 0) goto L19
            boolean r4 = r3.exists()     // Catch: java.lang.Exception -> L7b
            if (r4 == 0) goto L16
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != 0) goto L21
        L19:
            kotlin.C r3 = r6.f194480e     // Catch: java.lang.Exception -> L7b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Exception -> L7b
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Exception -> L7b
        L21:
            java.lang.String r4 = "msg-"
            java.lang.String r5 = ".jpg"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch: java.lang.Exception -> L7b
            boolean r4 = r6.f(r7, r3)     // Catch: java.lang.Exception -> L7b
            if (r4 != 0) goto L76
            android.content.Context r4 = r6.f194476a     // Catch: java.lang.Exception -> L7b
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L7b
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch: java.lang.Exception -> L7b
            if (r4 == 0) goto L59
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            kotlin.io.b.b(r4, r5)     // Catch: java.lang.Throwable -> L4c
            kotlin.io.c.a(r5, r2)     // Catch: java.lang.Throwable -> L4a
            kotlin.io.c.a(r4, r2)     // Catch: java.lang.Exception -> L7b
            goto L59
        L4a:
            r1 = move-exception
            goto L53
        L4c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r3 = move-exception
            kotlin.io.c.a(r5, r1)     // Catch: java.lang.Throwable -> L4a
            throw r3     // Catch: java.lang.Throwable -> L4a
        L53:
            throw r1     // Catch: java.lang.Throwable -> L54
        L54:
            r3 = move-exception
            kotlin.io.c.a(r4, r1)     // Catch: java.lang.Exception -> L7b
            throw r3     // Catch: java.lang.Exception -> L7b
        L59:
            com.avito.android.util.V2 r4 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Exception -> L7b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7b
            r5.<init>(r1)     // Catch: java.lang.Exception -> L7b
            r5.append(r7)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = " copied to "
            r5.append(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L7b
            r5.append(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L7b
            r4.i(r0, r1, r2)     // Catch: java.lang.Exception -> L7b
        L76:
            android.net.Uri r2 = android.net.Uri.fromFile(r3)     // Catch: java.lang.Exception -> L7b
            goto L8e
        L7b:
            com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to copy file: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.j(r0, r7, r2)
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.send.C32202b.d(android.net.Uri):android.net.Uri");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r8, java.io.File r9) {
        /*
            r7 = this;
            java.lang.String r0 = "MessengerPhotoStorage"
            java.lang.String r1 = r8.getScheme()
            java.lang.String r2 = "file"
            boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L8b
            java.lang.String r1 = r8.getAuthority()
            if (r1 == 0) goto L1c
            int r1 = r1.length()
            if (r1 != 0) goto L8b
        L1c:
            java.lang.String r1 = r8.getPath()
            if (r1 == 0) goto L8b
            int r1 = r1.length()
            if (r1 != 0) goto L29
            goto L8b
        L29:
            java.lang.String r1 = r8.getQuery()
            if (r1 != 0) goto L8b
            java.lang.String r1 = r8.getFragment()
            if (r1 != 0) goto L8b
            android.content.Context r1 = r7.f194476a
            java.io.File r4 = r1.getCacheDir()
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = com.avito.android.util.C5.c(r4)
            java.lang.String r5 = r8.toString()
            boolean r4 = kotlin.text.C43066x.h0(r5, r4, r3)
            if (r4 != 0) goto L89
            java.io.File r4 = r1.getExternalFilesDir(r2)
            if (r4 != 0) goto L59
            r4 = r3
            goto L6d
        L59:
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = com.avito.android.util.C5.c(r4)
            java.lang.String r5 = r8.toString()
            boolean r4 = kotlin.text.C43066x.h0(r5, r4, r3)
        L6d:
            if (r4 != 0) goto L89
            java.io.File r1 = r1.getFilesDir()
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.avito.android.util.C5.c(r1)
            java.lang.String r4 = r8.toString()
            boolean r1 = kotlin.text.C43066x.h0(r4, r1, r3)
            if (r1 == 0) goto L8b
        L89:
            r1 = 1
            goto L8c
        L8b:
            r1 = r3
        L8c:
            if (r1 == 0) goto Ld6
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Exception -> Lbf
            java.net.URI r4 = java.net.URI.create(r4)     // Catch: java.lang.Exception -> Lbf
            r1.<init>(r4)     // Catch: java.lang.Exception -> Lbf
            boolean r1 = r1.renameTo(r9)     // Catch: java.lang.Exception -> Lbf
            if (r1 == 0) goto Lc1
            com.avito.android.util.V2 r4 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Exception -> Lbf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r5.<init>()     // Catch: java.lang.Exception -> Lbf
            r5.append(r8)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r6 = " moved to "
            r5.append(r6)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Exception -> Lbf
            r5.append(r9)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> Lbf
            r4.i(r0, r9, r2)     // Catch: java.lang.Exception -> Lbf
            goto Lc1
        Lbf:
            r9 = move-exception
            goto Lc3
        Lc1:
            r3 = r1
            goto Ld6
        Lc3:
            com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to move resource located at: "
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.c(r0, r8, r9)
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.send.C32202b.f(android.net.Uri, java.io.File):boolean");
    }
}
