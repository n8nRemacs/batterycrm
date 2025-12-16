package io.ktor.network.selector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectorManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/selector/SelectInterest;", "", "a", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public enum SelectInterest {
    READ(1),
    WRITE(4),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPT(16),
    CONNECT(8);


    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f400131c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final SelectInterest[] f400132d = values();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final int[] f400133e;

    /* renamed from: b, reason: collision with root package name */
    public final int f400138b;

    /* compiled from: SelectorManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/selector/SelectInterest$a;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SelectInterest[] a() {
            return SelectInterest.f400132d;
        }

        public a() {
        }
    }

    static {
        SelectInterest[] selectInterestArrValues = values();
        ArrayList arrayList = new ArrayList(selectInterestArrValues.length);
        for (SelectInterest selectInterest : selectInterestArrValues) {
            arrayList.add(Integer.valueOf(selectInterest.f400138b));
        }
        f400133e = C42745f0.L0(arrayList);
        int length = values().length;
    }

    SelectInterest(int i12) {
        this.f400138b = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getF400138b() {
        return this.f400138b;
    }
}
