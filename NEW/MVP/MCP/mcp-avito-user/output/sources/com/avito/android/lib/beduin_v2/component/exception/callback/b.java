package com.avito.android.lib.beduin_v2.component.exception.callback;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExceptionWithCallbackComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/exception/callback/b;", "LYR/a;", "LJT0/a;", "a", "_design-modules_beduin-v2_renderer_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends YR.a<JT0.a> {

    /* renamed from: n, reason: collision with root package name */
    @k
    public final l<String, G0> f175592n;

    /* compiled from: ExceptionWithCallbackComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/exception/callback/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "LJT0/a;", "_design-modules_beduin-v2_renderer_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<JT0.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.lib.beduin_v2.component.exception.callback.a f175593c;

        /* compiled from: ExceptionWithCallbackComponent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.beduin_v2.component.exception.callback.b$a$a, reason: collision with other inner class name */
        public static final class C5186a extends N implements l<String, G0> {
            public C5186a() {
                super(1);
            }

            @Override // Y41.l
            public final G0 invoke(String str) {
                a aVar = a.this;
                aVar.f175593c.a(aVar.f338002b.f336560a, str);
                return G0.f406611a;
            }
        }

        public a(@k com.avito.android.lib.beduin_v2.component.exception.callback.a aVar) {
            super(JT0.b.f8999c);
            this.f175593c = aVar;
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(new C5186a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k l<? super String, G0> lVar) {
        super(R.string.component_exception);
        this.f175592n = lVar;
    }

    @Override // YR.a, com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        JT0.a aVar = (JT0.a) obj;
        ((a.C5186a) this.f175592n).invoke(aVar.f());
        super.l((com.avito.android.lib.design.text_view.a) view, kVar, aVar);
    }

    @Override // YR.a
    /* renamed from: u */
    public final void l(com.avito.android.lib.design.text_view.a aVar, com.avito.beduin.v2.theme.k kVar, JT0.a aVar2) {
        JT0.a aVar3 = aVar2;
        ((a.C5186a) this.f175592n).invoke(aVar3.f());
        super.l(aVar, kVar, aVar3);
    }
}
