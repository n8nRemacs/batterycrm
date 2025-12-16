package com.yandex.div.core.view2.divs;

import android.view.ViewGroup;
import androidx.compose.ui.platform.C22491k0;
import com.yandex.div2.DivContainer;
import com.yandex.div2.K5;
import com.yandex.div2.U3;
import com.yandex.div2.y8;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivContainerBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/q0;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/DivContainer;", "Landroid/view/ViewGroup;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37990q0 implements com.yandex.div.core.view2.N<DivContainer, ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368636a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f368637b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.n f368638c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.k f368639d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f368640e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f368641f;

    /* compiled from: DivContainerBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.q0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DivContainer.j f368642l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368643m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f368644n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(DivContainer.j jVar, com.yandex.div.json.expressions.e eVar, Y41.l<? super Integer, kotlin.G0> lVar) {
            super(1);
            this.f368642l = jVar;
            this.f368643m = eVar;
            this.f368644n = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            DivContainer.j jVar = this.f368642l;
            com.yandex.div.json.expressions.b<Boolean> bVar = jVar.f371413b;
            com.yandex.div.json.expressions.e eVar = this.f368643m;
            boolean zBooleanValue = bVar.a(eVar).booleanValue();
            boolean z12 = zBooleanValue;
            if (jVar.f371414c.a(eVar).booleanValue()) {
                z12 = (zBooleanValue ? 1 : 0) | 2;
            }
            int i12 = z12;
            if (jVar.f371412a.a(eVar).booleanValue()) {
                i12 = (z12 ? 1 : 0) | 4;
            }
            this.f368644n.invoke(Integer.valueOf(i12));
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C37990q0(@Y61.k C38006w c38006w, @Y61.k dagger.internal.u uVar, @Y61.k com.yandex.div.core.downloader.n nVar, @Y61.k com.yandex.div.core.downloader.k kVar, @Y61.k dagger.internal.f fVar, @Y61.k com.yandex.div.core.view2.errors.f fVar2) {
        this.f368636a = c38006w;
        this.f368637b = uVar;
        this.f368638c = nVar;
        this.f368639d = kVar;
        this.f368640e = fVar;
        this.f368641f = fVar2;
    }

    public static void a(com.yandex.div.core.view2.errors.d dVar, String str, String str2) {
        String strA;
        String str3 = "";
        if (str != null && (strA = C22491k0.a('\'', " with id='", str)) != null) {
            str3 = strA;
        }
        dVar.b(new Throwable(String.format("Incorrect child size. Container with wrap layout mode contains child%s with %s size along the cross axis.", Arrays.copyOf(new Object[]{str3, str2}, 2))));
    }

    public static void c(K5 k52, com.yandex.div2.H h12, com.yandex.div.json.expressions.e eVar, com.yandex.div.core.view2.errors.d dVar) {
        com.yandex.div.json.expressions.b<Boolean> bVar;
        Object objA = k52.a();
        if (objA instanceof U3) {
            a(dVar, h12.getF375608n(), "match parent");
        } else if ((objA instanceof y8) && (bVar = ((y8) objA).f377207a) != null && bVar.a(eVar).booleanValue()) {
            a(dVar, h12.getF375608n(), "wrap content with constrained=true");
        }
    }

    public static void d(F21.b bVar, DivContainer.j jVar, com.yandex.div.json.expressions.e eVar, Y41.l lVar) {
        a aVar = new a(jVar, eVar, lVar);
        bVar.e(jVar.f371413b.d(eVar, aVar));
        bVar.e(jVar.f371414c.d(eVar, aVar));
        bVar.e(jVar.f371412a.d(eVar, aVar));
        aVar.invoke(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0189 A[EDGE_INSN: B:214:0x0189->B:56:0x0189 BREAK  A[LOOP:0: B:53:0x0176->B:55:0x017f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029c A[EDGE_INSN: B:222:0x029c->B:95:0x029c BREAK  A[LOOP:3: B:70:0x020f->B:93:0x028d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017f A[LOOP:0: B:53:0x0176->B:55:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028d A[LOOP:3: B:70:0x020f->B:93:0x028d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k android.view.ViewGroup r28, @Y61.k com.yandex.div2.DivContainer r29, @Y61.k com.yandex.div.core.view2.C38029k r30, @Y61.k com.yandex.div.core.state.f r31) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37990q0.b(android.view.ViewGroup, com.yandex.div2.DivContainer, com.yandex.div.core.view2.k, com.yandex.div.core.state.f):void");
    }
}
