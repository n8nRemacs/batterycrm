package ru.cyberity.cbr.core.common;

import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43446d;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "isDebug", "Lkotlinx/serialization/json/a;", "a", "(Z)Lkotlinx/serialization/json/a;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g0 {

    /* compiled from: JsonUtils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/d;", "Lkotlin/G0;", "a", "(Lkotlinx/serialization/json/d;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.l<C43446d, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f432663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12) {
            super(1);
            this.f432663a = z12;
        }

        public final void a(@Y61.k C43446d c43446d) {
            c43446d.f412966c = true;
            c43446d.f412971h = true;
            c43446d.f412969f = this.f432663a;
            kotlinx.serialization.modules.g gVar = new kotlinx.serialization.modules.g();
            kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
            gVar.a(n0Var.b(Object.class), ru.cyberity.cbr.core.data.serializer.b.f433428a);
            gVar.a(n0Var.b(Date.class), ru.cyberity.cbr.core.data.serializer.a.f433425a);
            c43446d.f412980q = new kotlinx.serialization.modules.d(gVar.f413161a, gVar.f413162b, gVar.f413163c, gVar.f413164d, gVar.f413165e);
            c43446d.f412968e = true;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(C43446d c43446d) {
            a(c43446d);
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final AbstractC43443a a(boolean z12) {
        return kotlinx.serialization.json.v.a(new a(z12));
    }

    public static /* synthetic */ AbstractC43443a a(boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = n0.f432787a.isDebug();
        }
        return a(z12);
    }
}
