package com.avito.android.player_timebar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.exoplayer2.ui.C;
import com.google.android.material.R;
import com.google.android.material.slider.Slider;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.ranges.s;

/* compiled from: VideoPlayerTimeBar.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/avito/android/player_timebar/VideoPlayerTimeBar;", "Lcom/google/android/material/slider/Slider;", "Lcom/google/android/exoplayer2/ui/C;", "", "position", "Lkotlin/G0;", "setPosition", "(J)V", "duration", "setDuration", "getPreferredUpdateDelay", "()J", CrashHianalyticsData.TIME, "setKeyTimeIncrement", "", "count", "setKeyCountIncrement", "(I)V", "bufferedPosition", "setBufferedPosition", "a", "_avito_player-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VideoPlayerTimeBar extends Slider implements C {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f220331p0 = 0;

    /* compiled from: VideoPlayerTimeBar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/player_timebar/VideoPlayerTimeBar$a;", "", "<init>", "()V", "", "ACTIVE_THUMB_RADIUS_COEF", "F", "", "UPDATE_DELAY", "J", "_avito_player-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoPlayerTimeBar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/player_timebar/VideoPlayerTimeBar$b", "Lcom/google/android/material/slider/Slider$b;", "_avito_player-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Slider.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C.a f220332a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoPlayerTimeBar f220333b;

        public b(C.a aVar, VideoPlayerTimeBar videoPlayerTimeBar) {
            this.f220332a = aVar;
            this.f220333b = videoPlayerTimeBar;
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* renamed from: d */
        public final void a(@k Slider slider) {
            this.f220332a.c((long) this.f220333b.getValue());
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* renamed from: f */
        public final void b(@k Slider slider) {
            this.f220332a.b((long) this.f220333b.getValue(), false);
        }
    }

    static {
        new a(null);
    }

    @j
    public VideoPlayerTimeBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.google.android.exoplayer2.ui.C
    public final void c(@k C.a aVar) {
        z(new b(aVar, this));
        y(new com.avito.android.cpx_promo.impl.b(aVar, this));
    }

    @Override // com.google.android.exoplayer2.ui.C
    public long getPreferredUpdateDelay() {
        return 50L;
    }

    @Override // com.google.android.exoplayer2.ui.C
    public void setDuration(long duration) {
        float f12 = duration;
        if (getValueTo() == f12) {
            return;
        }
        setValueTo(s.a(f12, getValueFrom() + Float.MIN_VALUE));
    }

    @Override // com.google.android.exoplayer2.ui.C
    public void setPosition(long position) {
        float f12 = position;
        if (getValue() == f12) {
            return;
        }
        setValue(s.f(f12, getValueFrom(), getValueTo()));
    }

    public VideoPlayerTimeBar(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.sliderStyle : i12);
        z(new com.avito.android.player_timebar.a(this));
    }

    @Override // com.google.android.exoplayer2.ui.C
    public final void a(@k C.a aVar) {
    }

    @Override // com.google.android.exoplayer2.ui.C
    public void setBufferedPosition(long bufferedPosition) {
    }

    public void setKeyCountIncrement(int count) {
    }

    public void setKeyTimeIncrement(long time) {
    }

    @Override // com.google.android.exoplayer2.ui.C
    public final void b(@l long[] jArr, @l boolean[] zArr, int i12) {
    }
}
