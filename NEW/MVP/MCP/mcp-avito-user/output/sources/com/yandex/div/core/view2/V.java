package com.yandex.div.core.view2;

import android.view.View;
import androidx.collection.C20199a;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.divs.C37935b;
import com.yandex.div2.w8;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivVisibilityActionDispatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class V extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w8[] f367881l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f367882m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38029k f367883n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f367884o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(w8[] w8VarArr, U u12, C38029k c38029k, View view) {
        super(0);
        this.f367881l = w8VarArr;
        this.f367882m = u12;
        this.f367883n = c38029k;
        this.f367884o = view;
    }

    @Override // Y41.a
    public final G0 invoke() {
        w8[] w8VarArr = this.f367881l;
        int length = w8VarArr.length;
        int i12 = 0;
        while (i12 < length) {
            w8 w8Var = w8VarArr[i12];
            i12++;
            U u12 = this.f367882m;
            u12.getClass();
            C38029k c38029k = this.f367883n;
            C38024f c38024f = new C38024f(c38029k.getLogId(), c38029k.getDataTag().f428995a, w8Var.f376951a);
            C20199a c20199a = u12.f367880e;
            Object obj = c20199a.get(c38024f);
            if (obj == null) {
                obj = 0;
                c20199a.put(c38024f, obj);
            }
            int iIntValue = ((Number) obj).intValue();
            long jLongValue = w8Var.f376952b.a(c38029k.getExpressionResolver()).longValue();
            if (jLongValue == 0 || iIntValue < jLongValue) {
                C37916k c37916k = u12.f367878c;
                boolean useActionUid = c37916k.getUseActionUid();
                C37935b c37935b = u12.f367879d;
                InterfaceC37915j interfaceC37915j = u12.f367876a;
                if (useActionUid) {
                    String string = UUID.randomUUID().toString();
                    C37916k actionHandler = c38029k.getActionHandler();
                    if (!(actionHandler == null ? false : actionHandler.handleAction(w8Var, c38029k, string)) && !c37916k.handleAction(w8Var, c38029k, string)) {
                        interfaceC37915j.getClass();
                        InterfaceC37915j interfaceC37915j2 = InterfaceC37915j.f367563a;
                        c37935b.b(w8Var, c38029k.getExpressionResolver());
                    }
                } else {
                    C37916k actionHandler2 = c38029k.getActionHandler();
                    if (!(actionHandler2 == null ? false : actionHandler2.handleAction(w8Var, c38029k)) && !c37916k.handleAction(w8Var, c38029k)) {
                        interfaceC37915j.getClass();
                        InterfaceC37915j interfaceC37915j3 = InterfaceC37915j.f367563a;
                        c37935b.b(w8Var, c38029k.getExpressionResolver());
                    }
                }
                c20199a.put(c38024f, Integer.valueOf(iIntValue + 1));
                int i13 = com.yandex.div.internal.p.f370124a;
            }
        }
        return G0.f406611a;
    }
}
