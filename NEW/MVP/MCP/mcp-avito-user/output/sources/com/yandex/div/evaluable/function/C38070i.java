package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.a;
import kotlin.Metadata;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/i;", "Lcom/yandex/div/evaluable/function/k;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38070i extends AbstractC38074k {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C38070i f369743f = new C38070i();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final String f369744g = "setColorBlue";

    /* compiled from: ColorFunctions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/div/evaluable/types/a;", "color", "", "blue", "invoke-Gnj5c28", "(ID)I", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.evaluable.function.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.evaluable.types.a, Double, com.yandex.div.evaluable.types.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f369745l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.yandex.div.evaluable.types.a invoke(com.yandex.div.evaluable.types.a aVar, Double d12) {
            int i12 = aVar.f369991a;
            double dDoubleValue = d12.doubleValue();
            a.C10920a c10920a = com.yandex.div.evaluable.types.a.f369990b;
            int iA2 = C38076l.a(dDoubleValue);
            c10920a.getClass();
            return com.yandex.div.evaluable.types.a.a(a.C10920a.a(i12 >>> 24, (i12 >> 16) & 255, (i12 >> 8) & 255, iA2));
        }
    }

    public C38070i() {
        super(a.f369745l);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369744g;
    }
}
