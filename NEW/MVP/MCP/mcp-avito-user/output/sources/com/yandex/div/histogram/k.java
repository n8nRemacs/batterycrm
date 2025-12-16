package com.yandex.div.histogram;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HistogramCallTypeChecker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/histogram/k;", "", "<init>", "()V", "div-histogram_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f370017a = C42727D.c(a.f370018l);

    /* compiled from: HistogramCallTypeChecker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/G0;", "invoke", "()Ljava/util/concurrent/ConcurrentHashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<ConcurrentHashMap<String, G0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f370018l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ConcurrentHashMap<String, G0> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    public final boolean a(@Y61.k String str) {
        InterfaceC42726C interfaceC42726C = this.f370017a;
        return !((ConcurrentHashMap) interfaceC42726C.getValue()).containsKey(str) && ((ConcurrentHashMap) interfaceC42726C.getValue()).putIfAbsent(str, G0.f406611a) == null;
    }
}
