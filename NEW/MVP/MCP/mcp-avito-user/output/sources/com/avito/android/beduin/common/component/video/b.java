package com.avito.android.beduin.common.component.video;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinVideoComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/video/VideoChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/video/VideoChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<VideoChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f102893l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.video.a f102894m;

    /* compiled from: BeduinVideoComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102895a;

        static {
            int[] iArr = new int[VideoChange.values().length];
            try {
                iArr[VideoChange.f102883c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102895a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, com.avito.android.beduin.common.component.video.a aVar) {
        super(1);
        this.f102893l = fVar;
        this.f102894m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(VideoChange videoChange) {
        if (a.f102895a[videoChange.ordinal()] == 1) {
            this.f102893l.setPendingPlayingState(this.f102894m.f102888e.getState());
        }
        return G0.f406611a;
    }
}
