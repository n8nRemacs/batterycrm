package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.a;
import kotlin.Metadata;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/h;", "Lcom/yandex/div/evaluable/function/j;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38068h extends AbstractC38072j {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C38068h f369730f = new C38068h();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final String f369731g = "getColorBlue";

    /* compiled from: ColorFunctions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div/evaluable/types/a;", "color", "", "invoke-cIhhviA", "(I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.evaluable.function.h$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.yandex.div.evaluable.types.a, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f369732l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Integer invoke(com.yandex.div.evaluable.types.a aVar) {
            int i12 = aVar.f369991a;
            a.C10920a c10920a = com.yandex.div.evaluable.types.a.f369990b;
            return Integer.valueOf(i12 & 255);
        }
    }

    public C38068h() {
        super(a.f369732l);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369731g;
    }
}
