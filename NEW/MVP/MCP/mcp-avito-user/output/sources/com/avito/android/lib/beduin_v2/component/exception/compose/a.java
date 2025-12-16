package com.avito.android.lib.beduin_v2.component.exception.compose;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import com.avito.beduin.v2.render.compose.k;
import com.squareup.anvil.annotations.ContributesBinding;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorComponentRendererImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/exception/compose/a;", "Lcom/avito/beduin/v2/render/compose/k;", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f175598a = new a();

    /* compiled from: ErrorComponentRendererImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.exception.compose.a$a, reason: collision with other inner class name */
    public static final class C5188a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f175600m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f175601n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f175602o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f175603p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5188a(v vVar, String str, String str2, int i12) {
            super(2);
            this.f175600m = vVar;
            this.f175601n = str;
            this.f175602o = str2;
            this.f175603p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175603p | 1);
            a.this.a(iA2, a12, this.f175600m, this.f175601n, this.f175602o);
            return G0.f406611a;
        }
    }

    @Override // com.avito.beduin.v2.render.compose.k
    @InterfaceC22132o
    public final void a(int i12, @l A a12, @Y61.k v vVar, @Y61.k String str, @Y61.k String str2) {
        B bE2 = a12.E(-624656095);
        if ((i12 & 1) == 0 && bE2.c()) {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5188a(vVar, str, str2, i12);
        }
    }
}
