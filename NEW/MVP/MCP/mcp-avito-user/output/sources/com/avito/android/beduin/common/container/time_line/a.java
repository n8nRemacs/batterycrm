package com.avito.android.beduin.common.container.time_line;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTimeLineContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/TimeLineContainerChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/container/time_line/TimeLineContainerChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements l<TimeLineContainerChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f103236l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f103237m;

    /* compiled from: BeduinTimeLineContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.time_line.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3098a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103238a;

        static {
            int[] iArr = new int[TimeLineContainerChange.values().length];
            try {
                iArr[TimeLineContainerChange.f103231c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f103238a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, e eVar) {
        super(1);
        this.f103236l = bVar;
        this.f103237m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(TimeLineContainerChange timeLineContainerChange) {
        if (C3098a.f103238a[timeLineContainerChange.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.f103236l.p(this.f103237m);
        return G0.f406611a;
    }
}
