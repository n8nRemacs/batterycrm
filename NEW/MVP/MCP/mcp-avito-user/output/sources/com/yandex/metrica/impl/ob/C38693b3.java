package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.b3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38693b3 implements InterfaceC38963m {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final S3 f380145a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f380146b;

    /* renamed from: com.yandex.metrica.impl.ob.b3$a */
    public class a extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T21.b f380147a;

        public a(T21.b bVar) {
            this.f380147a = bVar;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            S3 s32 = C38693b3.this.f380145a;
            C38693b3 c38693b3 = C38693b3.this;
            T21.b bVar = this.f380147a;
            c38693b3.getClass();
            s32.a(C38715c0.a().a(new C38843h3(bVar).a()));
        }
    }

    public C38693b3(@j.N S3 s32, @j.N ICommonExecutor iCommonExecutor) {
        this.f380145a = s32;
        this.f380146b = iCommonExecutor;
    }

    public void a(@j.N List<T21.b> list) {
        Iterator<T21.b> it = list.iterator();
        while (it.hasNext()) {
            this.f380146b.execute(new a(it.next()));
        }
    }
}
