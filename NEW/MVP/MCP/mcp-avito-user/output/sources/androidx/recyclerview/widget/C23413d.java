package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C23424o;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer.java */
/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23413d<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f53988h = new c();

    /* renamed from: a, reason: collision with root package name */
    public final C23411b f53989a;

    /* renamed from: b, reason: collision with root package name */
    public final C23412c<T> f53990b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f53991c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f53992d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public List<T> f53993e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public List<T> f53994f;

    /* renamed from: g, reason: collision with root package name */
    public int f53995g;

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f53996b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f53997c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f53998d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Runnable f53999e;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C1912a extends C23424o.b {
            public C1912a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C23424o.b
            public final boolean areContentsTheSame(int i12, int i13) {
                a aVar = a.this;
                Object obj = aVar.f53996b.get(i12);
                Object obj2 = aVar.f53997c.get(i13);
                if (obj != null && obj2 != null) {
                    return C23413d.this.f53990b.f53983b.a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C23424o.b
            public final boolean areItemsTheSame(int i12, int i13) {
                a aVar = a.this;
                Object obj = aVar.f53996b.get(i12);
                Object obj2 = aVar.f53997c.get(i13);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C23413d.this.f53990b.f53983b.b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C23424o.b
            @j.P
            public final Object getChangePayload(int i12, int i13) {
                a aVar = a.this;
                Object obj = aVar.f53996b.get(i12);
                Object obj2 = aVar.f53997c.get(i13);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C23413d.this.f53990b.f53983b.c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public final int getNewListSize() {
                return a.this.f53997c.size();
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public final int getOldListSize() {
                return a.this.f53996b.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C23424o.e f54002b;

            public b(C23424o.e eVar) {
                this.f54002b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                C23413d c23413d = C23413d.this;
                if (c23413d.f53995g == aVar.f53998d) {
                    List<T> list = c23413d.f53994f;
                    List<T> list2 = aVar.f53997c;
                    c23413d.f53993e = list2;
                    c23413d.f53994f = Collections.unmodifiableList(list2);
                    this.f54002b.a(c23413d.f53989a);
                    c23413d.a(list, aVar.f53999e);
                }
            }
        }

        public a(List list, List list2, int i12, Runnable runnable) {
            this.f53996b = list;
            this.f53997c = list2;
            this.f53998d = i12;
            this.f53999e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23413d.this.f53991c.execute(new b(C23424o.a(new C1912a(), true)));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        void a(@j.N List<T> list, @j.N List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$c */
    public static class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f54004b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@j.N Runnable runnable) {
            this.f54004b.post(runnable);
        }
    }

    public C23413d() {
        throw null;
    }

    public C23413d(@j.N C23411b c23411b, @j.N C23412c c23412c) {
        this.f53992d = new CopyOnWriteArrayList();
        this.f53994f = Collections.emptyList();
        this.f53989a = c23411b;
        this.f53990b = c23412c;
        this.f53991c = f53988h;
    }

    public final void a(@j.N List<T> list, @j.P Runnable runnable) {
        Iterator it = this.f53992d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f53994f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(@j.P List<T> list, @j.P Runnable runnable) {
        int i12 = this.f53995g + 1;
        this.f53995g = i12;
        List<T> list2 = this.f53993e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f53994f;
        C23411b c23411b = this.f53989a;
        if (list == null) {
            int size = list2.size();
            this.f53993e = null;
            this.f53994f = Collections.emptyList();
            c23411b.b(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f53990b.f53982a.execute(new a(list2, list, i12, runnable));
            return;
        }
        this.f53993e = list;
        this.f53994f = Collections.unmodifiableList(list);
        c23411b.c(0, list.size());
        a(list3, runnable);
    }
}
