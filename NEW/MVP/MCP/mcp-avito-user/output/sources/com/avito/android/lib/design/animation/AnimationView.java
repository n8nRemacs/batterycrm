package com.avito.android.lib.design.animation;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.r;
import com.airbnb.lottie.LottieAnimationView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.animation.b;
import com.avito.android.lib.design.d;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: AnimationView.kt */
@s0
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\nVWXYZ[\u0018\u001e\\]J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0017R$\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0013R$\u0010'\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010\u0013R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00104\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0007R$\u0010:\u001a\u0002052\u0006\u00100\u001a\u0002058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u00100\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020;2\u0006\u00100\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R$\u0010I\u001a\u00020D2\u0006\u00100\u001a\u00020D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010O\u001a\u0004\u0018\u00010J2\b\u00100\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010U\u001a\u0004\u0018\u00010P2\b\u00100\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006^"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "Lcom/avito/android/lib/design/animation/AnimationView$a;", "data", "setAnimationData", "(Lcom/avito/android/lib/design/animation/AnimationView$a;)V", "Lcom/avito/android/lib/design/animation/b$a;", "animation", "setEngineAnimationData", "(Lcom/avito/android/lib/design/animation/b$a;)V", "Lcom/avito/android/lib/design/animation/AnimationView$d;", "imageData", "setImage", "(Lcom/avito/android/lib/design/animation/AnimationView$d;)V", "", "isImageVisible", "setImageVisible", "(Z)V", "e", "Z", "getAutoPlay", "()Z", "setAutoPlay", "autoPlay", "f", "Lcom/avito/android/lib/design/animation/AnimationView$d;", "getFallbackImageData", "()Lcom/avito/android/lib/design/animation/AnimationView$d;", "setFallbackImageData", "fallbackImageData", "g", "getLoadingImageData", "setLoadingImageData", "loadingImageData", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "h", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "getLoadingStateListener", "()Lcom/avito/android/lib/design/animation/AnimationView$f;", "setLoadingStateListener", "(Lcom/avito/android/lib/design/animation/AnimationView$f;)V", "loadingStateListener", "value", "getRepeatCount", "()I", "setRepeatCount", "repeatCount", "Lcom/avito/android/lib/design/animation/AnimationView$RepeatMode;", "getRepeatMode", "()Lcom/avito/android/lib/design/animation/AnimationView$RepeatMode;", "setRepeatMode", "(Lcom/avito/android/lib/design/animation/AnimationView$RepeatMode;)V", "repeatMode", "", "getProgress", "()F", "setProgress", "(F)V", "progress", "getSpeed", "setSpeed", "speed", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "Lcom/avito/android/lib/design/animation/AnimationView$b;", "getAnimationProgressListener", "()Lcom/avito/android/lib/design/animation/AnimationView$b;", "setAnimationProgressListener", "(Lcom/avito/android/lib/design/animation/AnimationView$b;)V", "animationProgressListener", "Lcom/avito/android/lib/design/animation/AnimationView$c;", "getAnimationStateListener", "()Lcom/avito/android/lib/design/animation/AnimationView$c;", "setAnimationStateListener", "(Lcom/avito/android/lib/design/animation/AnimationView$c;)V", "animationStateListener", "a", "b", "AnimationState", "c", "EngineType", "d", "RepeatMode", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnimationView extends FrameLayout implements InterfaceC46971a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f178266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f178267c;

    /* renamed from: d, reason: collision with root package name */
    public com.avito.android.lib.design.animation.d f178268d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean autoPlay;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public d fallbackImageData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public d loadingImageData;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public f loadingStateListener;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.animation.a f178273i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$AnimationState;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimationState {

        /* renamed from: b, reason: collision with root package name */
        public static final AnimationState f178274b;

        /* renamed from: c, reason: collision with root package name */
        public static final AnimationState f178275c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AnimationState[] f178276d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178277e;

        static {
            AnimationState animationState = new AnimationState("Paused", 0);
            f178274b = animationState;
            AnimationState animationState2 = new AnimationState("InProgress", 1);
            f178275c = animationState2;
            AnimationState[] animationStateArr = {animationState, animationState2};
            f178276d = animationStateArr;
            f178277e = kotlin.enums.c.a(animationStateArr);
        }

        public AnimationState() {
            throw null;
        }

        public static AnimationState valueOf(String str) {
            return (AnimationState) Enum.valueOf(AnimationState.class, str);
        }

        public static AnimationState[] values() {
            return (AnimationState[]) f178276d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$EngineType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineType {

        /* renamed from: b, reason: collision with root package name */
        public static final EngineType f178278b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EngineType[] f178279c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178280d;

        static {
            EngineType engineType = new EngineType("Lottie", 0);
            f178278b = engineType;
            EngineType[] engineTypeArr = {engineType};
            f178279c = engineTypeArr;
            f178280d = kotlin.enums.c.a(engineTypeArr);
        }

        public EngineType() {
            throw null;
        }

        public static EngineType valueOf(String str) {
            return (EngineType) Enum.valueOf(EngineType.class, str);
        }

        public static EngineType[] values() {
            return (EngineType[]) f178279c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$RepeatMode;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RepeatMode {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f178281b;

        /* renamed from: c, reason: collision with root package name */
        public static final RepeatMode f178282c;

        /* renamed from: d, reason: collision with root package name */
        public static final RepeatMode f178283d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ RepeatMode[] f178284e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178285f;

        /* compiled from: AnimationView.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$RepeatMode$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            RepeatMode repeatMode = new RepeatMode("Restart", 0);
            f178282c = repeatMode;
            RepeatMode repeatMode2 = new RepeatMode("Reverse", 1);
            f178283d = repeatMode2;
            RepeatMode[] repeatModeArr = {repeatMode, repeatMode2};
            f178284e = repeatModeArr;
            f178285f = kotlin.enums.c.a(repeatModeArr);
            f178281b = new a(null);
        }

        public RepeatMode() {
            throw null;
        }

        public static RepeatMode valueOf(String str) {
            return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
        }

        public static RepeatMode[] values() {
            return (RepeatMode[]) f178284e.clone();
        }
    }

    /* compiled from: AnimationView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Parcelable f178286b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f178287c;

        /* compiled from: AnimationView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(boolean z12, @l Parcelable parcelable) {
            super(parcelable);
            this.f178286b = parcelable;
            this.f178287c = z12;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f178286b, i12);
            parcel.writeInt(this.f178287c ? 1 : 0);
        }
    }

    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$a;", "", "b", "c", "d", "e", "Lcom/avito/android/lib/design/animation/AnimationView$a$b;", "Lcom/avito/android/lib/design/animation/AnimationView$a$c;", "Lcom/avito/android/lib/design/animation/AnimationView$a$d;", "Lcom/avito/android/lib/design/animation/AnimationView$a$e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: AnimationView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.animation.AnimationView$a$a, reason: collision with other inner class name */
        public static final class C5254a {
            @l
            public static b.a a(@k a aVar) {
                if (aVar instanceof c) {
                    c cVar = (c) aVar;
                    return new b.a.C5257b(cVar.f178288a, cVar.f178289b, cVar.f178290c);
                }
                if (aVar instanceof e) {
                    e eVar = (e) aVar;
                    return new b.a.d(eVar.f178293a, eVar.f178294b, eVar.f178295c);
                }
                if (!(aVar instanceof d)) {
                    return null;
                }
                d dVar = (d) aVar;
                return new b.a.c(dVar.f178291a, dVar.f178292b);
            }
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$a$b;", "Lcom/avito/android/lib/design/animation/AnimationView$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {
            @Override // com.avito.android.lib.design.animation.AnimationView.a
            @l
            public final b.a a() {
                return C5254a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "Image(data=null)";
            }
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$a$c;", "Lcom/avito/android/lib/design/animation/AnimationView$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f178288a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f178289b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final EngineType f178290c;

            public c(String str, String str2, EngineType engineType, int i12, C42822w c42822w) {
                str2 = (i12 & 2) != 0 ? String.valueOf(str.hashCode()) : str2;
                engineType = (i12 & 4) != 0 ? EngineType.f178278b : engineType;
                this.f178288a = str;
                this.f178289b = str2;
                this.f178290c = engineType;
            }

            @Override // com.avito.android.lib.design.animation.AnimationView.a
            @l
            public final b.a a() {
                return C5254a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f178288a, cVar.f178288a) && L.f(this.f178289b, cVar.f178289b) && this.f178290c == cVar.f178290c;
            }

            public final int hashCode() {
                int iHashCode = this.f178288a.hashCode() * 31;
                String str = this.f178289b;
                return this.f178290c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "Json(value=" + this.f178288a + ", key=" + this.f178289b + ", engine=" + this.f178290c + ')';
            }
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$a$d;", "Lcom/avito/android/lib/design/animation/AnimationView$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            public final int f178291a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final EngineType f178292b;

            public d(int i12, EngineType engineType, int i13, C42822w c42822w) {
                engineType = (i13 & 2) != 0 ? EngineType.f178278b : engineType;
                this.f178291a = i12;
                this.f178292b = engineType;
            }

            @Override // com.avito.android.lib.design.animation.AnimationView.a
            @l
            public final b.a a() {
                return C5254a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f178291a == dVar.f178291a && this.f178292b == dVar.f178292b;
            }

            public final int hashCode() {
                return this.f178292b.hashCode() + (Integer.hashCode(this.f178291a) * 31);
            }

            @k
            public final String toString() {
                return "Resource(resId=" + this.f178291a + ", engine=" + this.f178292b + ')';
            }
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$a$e;", "Lcom/avito/android/lib/design/animation/AnimationView$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f178293a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f178294b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final EngineType f178295c;

            public e(String str, String str2, EngineType engineType, int i12, C42822w c42822w) {
                str2 = (i12 & 2) != 0 ? str : str2;
                engineType = (i12 & 4) != 0 ? EngineType.f178278b : engineType;
                this.f178293a = str;
                this.f178294b = str2;
                this.f178295c = engineType;
            }

            @Override // com.avito.android.lib.design.animation.AnimationView.a
            @l
            public final b.a a() {
                return C5254a.a(this);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f178293a, eVar.f178293a) && L.f(this.f178294b, eVar.f178294b) && this.f178295c == eVar.f178295c;
            }

            public final int hashCode() {
                int iHashCode = this.f178293a.hashCode() * 31;
                String str = this.f178294b;
                return this.f178295c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "Url(url=" + this.f178293a + ", key=" + this.f178294b + ", engine=" + this.f178295c + ')';
            }
        }

        @l
        b.a a();
    }

    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(float f12);
    }

    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@k AnimationState animationState, @k AnimationState animationState2);
    }

    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$d;", "", "a", "b", "Lcom/avito/android/lib/design/animation/AnimationView$d$a;", "Lcom/avito/android/lib/design/animation/AnimationView$d$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$d$a;", "Lcom/avito/android/lib/design/animation/AnimationView$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Drawable f178296a;

            public a(@k Drawable drawable) {
                this.f178296a = drawable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f178296a, ((a) obj).f178296a);
            }

            public final int hashCode() {
                return this.f178296a.hashCode();
            }

            @k
            public final String toString() {
                return "Image(drawable=" + this.f178296a + ')';
            }
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$d$b;", "Lcom/avito/android/lib/design/animation/AnimationView$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            public final int f178297a;

            public b(int i12) {
                this.f178297a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f178297a == ((b) obj).f178297a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f178297a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Resource(resId="), this.f178297a, ')');
            }
        }
    }

    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$e;", "", "a", "b", "c", "d", "Lcom/avito/android/lib/design/animation/AnimationView$e$a;", "Lcom/avito/android/lib/design/animation/AnimationView$e$b;", "Lcom/avito/android/lib/design/animation/AnimationView$e$c;", "Lcom/avito/android/lib/design/animation/AnimationView$e$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$e$a;", "Lcom/avito/android/lib/design/animation/AnimationView$e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Throwable f178298a;

            public a(@k Throwable th2) {
                this.f178298a = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f178298a, ((a) obj).f178298a);
            }

            public final int hashCode() {
                return this.f178298a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f178298a, ')');
            }
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$e$b;", "Lcom/avito/android/lib/design/animation/AnimationView$e;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f178299a = new b();
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$e$c;", "Lcom/avito/android/lib/design/animation/AnimationView$e;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f178300a = new c();
        }

        /* compiled from: AnimationView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$e$d;", "Lcom/avito/android/lib/design/animation/AnimationView$e;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f178301a = new d();
        }
    }

    /* compiled from: AnimationView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView$f;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        void a(@k e eVar, @k e eVar2);
    }

    /* compiled from: AnimationView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178302a;

        static {
            int[] iArr = new int[EngineType.values().length];
            try {
                EngineType engineType = EngineType.f178278b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f178302a = iArr;
        }
    }

    @j
    public AnimationView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static final void a(AnimationView animationView, e eVar) {
        if (eVar instanceof e.c) {
            d dVar = animationView.loadingImageData;
            if (dVar != null) {
                animationView.setImage(dVar);
                return;
            }
            return;
        }
        if (eVar instanceof e.a) {
            d dVar2 = animationView.fallbackImageData;
            if (dVar2 != null) {
                animationView.setImage(dVar2);
                return;
            }
            return;
        }
        if (eVar instanceof e.b) {
            animationView.setImageVisible(false);
            if (animationView.autoPlay) {
                animationView.e();
            }
        }
    }

    private final void setEngineAnimationData(b.a animation) {
        EngineType engineTypeA = animation.a();
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        if (engineTypeA != dVar.f178339a) {
            f(engineTypeA);
        }
        setImageVisible(false);
        com.avito.android.lib.design.animation.d dVar2 = this.f178268d;
        com.avito.android.lib.design.animation.d dVar3 = dVar2 != null ? dVar2 : null;
        dVar3.getClass();
        e.c cVar = e.c.f178300a;
        e eVar = dVar3.f178341c;
        dVar3.f178341c = cVar;
        com.avito.android.lib.design.animation.a aVar = dVar3.f178345g;
        if (aVar != null) {
            aVar.a(eVar, cVar);
        }
        boolean z12 = animation instanceof b.a.C5257b;
        LottieAnimationView lottieAnimationView = dVar3.f178340b;
        if (z12) {
            b.a.C5257b c5257b = (b.a.C5257b) animation;
            lottieAnimationView.n(c5257b.f178330a, c5257b.f178331b);
        } else if (animation instanceof b.a.d) {
            b.a.d dVar4 = (b.a.d) animation;
            lottieAnimationView.o(dVar4.f178335a, dVar4.f178336b);
        } else if (animation instanceof b.a.c) {
            lottieAnimationView.setAnimation(((b.a.c) animation).f178333a);
        }
    }

    private final void setImage(d imageData) {
        setImageVisible(true);
        boolean z12 = imageData instanceof d.b;
        ImageView imageView = this.f178267c;
        if (z12) {
            imageView.setImageResource(((d.b) imageData).f178297a);
        } else if (imageData instanceof d.a) {
            imageView.setImageDrawable(((d.a) imageData).f178296a);
        }
    }

    private final void setImageVisible(boolean isImageVisible) {
        this.f178266b.setVisibility(isImageVisible ? 8 : 0);
        this.f178267c.setVisibility(isImageVisible ? 0 : 8);
    }

    public final void b(TypedArray typedArray) {
        String string;
        int resourceId;
        int resourceId2;
        int resourceId3;
        if (typedArray.hasValue(3)) {
            this.autoPlay = typedArray.getBoolean(3, true);
        }
        if (typedArray.hasValue(7)) {
            setRepeatCount(typedArray.getInteger(7, -1));
        }
        if (typedArray.hasValue(8)) {
            setRepeatMode(RepeatMode.values()[typedArray.getInt(8, 0)]);
        }
        if (typedArray.hasValue(9)) {
            setSpeed(typedArray.getFloat(9, 1.0f));
        }
        if (typedArray.hasValue(6) && (resourceId3 = typedArray.getResourceId(6, -1)) != -1) {
            this.loadingImageData = new d.b(resourceId3);
        }
        if (typedArray.hasValue(5) && (resourceId2 = typedArray.getResourceId(5, -1)) != -1) {
            this.fallbackImageData = new d.b(resourceId2);
        }
        if (typedArray.hasValue(1) && (resourceId = typedArray.getResourceId(1, -1)) != -1) {
            setAnimationData(new a.d(resourceId, null, 2, null));
        }
        if (typedArray.hasValue(2) && (string = typedArray.getString(2)) != null && string.length() > 0) {
            setAnimationData(new a.e(string, null, null, 6, null));
        }
        if (typedArray.hasValue(0)) {
            setScaleType(ImageView.ScaleType.values()[typedArray.getInt(0, ImageView.ScaleType.FIT_CENTER.ordinal())]);
        }
    }

    public final void c() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a();
    }

    public final void d() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178340b.l();
    }

    public final void e() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178340b.m();
    }

    public final void f(EngineType engineType) {
        if (g.f178302a[engineType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.lib.design.animation.d dVar = new com.avito.android.lib.design.animation.d(getContext(), null, 0, 6, null);
        com.avito.android.lib.design.animation.d dVar2 = this.f178268d;
        if (dVar2 != null) {
            dVar2.a();
        } else {
            dVar2 = null;
        }
        this.f178268d = dVar;
        b bVar = dVar2 != null ? dVar2.f178343e : null;
        c cVar = dVar2 != null ? dVar2.f178344f : null;
        if (dVar2 != null) {
            dVar2.f178343e = null;
        }
        if (dVar2 != null) {
            dVar2.f178344f = null;
        }
        if (dVar2 != null) {
            dVar2.f178345g = null;
        }
        dVar.f178345g = this.f178273i;
        dVar.f178343e = bVar;
        dVar.f178344f = cVar;
        ViewGroup viewGroup = this.f178266b;
        viewGroup.removeAllViews();
        LottieAnimationView lottieAnimationView = dVar.f178340b;
        lottieAnimationView.setId(R.id.animation_view_id);
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(lottieAnimationView);
    }

    @l
    public final b getAnimationProgressListener() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178343e;
    }

    @l
    public final c getAnimationStateListener() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178344f;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    @l
    public final d getFallbackImageData() {
        return this.fallbackImageData;
    }

    @l
    public final d getLoadingImageData() {
        return this.loadingImageData;
    }

    @l
    public final f getLoadingStateListener() {
        return this.loadingStateListener;
    }

    public final float getProgress() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178340b.getProgress();
    }

    public final int getRepeatCount() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178340b.getRepeatCount();
    }

    @k
    public final RepeatMode getRepeatMode() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178340b.getRepeatMode() == 1 ? RepeatMode.f178282c : RepeatMode.f178283d;
    }

    @k
    public final ImageView.ScaleType getScaleType() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178340b.getScaleType();
    }

    public final float getSpeed() {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.f178340b.getSpeed();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f178286b);
        this.autoPlay = savedState.f178287c;
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.autoPlay, super.onSaveInstanceState());
    }

    public final void setAnimationData(@k a data) {
        if (data instanceof a.b) {
            setImage(null);
            return;
        }
        b.a aVarA = data.a();
        if (aVarA != null) {
            setEngineAnimationData(aVarA);
        }
    }

    public final void setAnimationProgressListener(@l b bVar) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178343e = bVar;
    }

    public final void setAnimationStateListener(@l c cVar) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178344f = cVar;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178998v);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setAutoPlay(boolean z12) {
        this.autoPlay = z12;
    }

    public final void setFallbackImageData(@l d dVar) {
        this.fallbackImageData = dVar;
    }

    public final void setLoadingImageData(@l d dVar) {
        this.loadingImageData = dVar;
    }

    public final void setLoadingStateListener(@l f fVar) {
        this.loadingStateListener = fVar;
    }

    public final void setProgress(float f12) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178340b.setProgress(f12);
    }

    public final void setRepeatCount(int i12) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        LottieAnimationView lottieAnimationView = dVar.f178340b;
        if (i12 == -1) {
            lottieAnimationView.setRepeatCount(-1);
        } else {
            lottieAnimationView.setRepeatCount(i12);
        }
    }

    public final void setRepeatMode(@k RepeatMode repeatMode) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.getClass();
        int iOrdinal = repeatMode.ordinal();
        int i12 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 2;
        }
        dVar.f178340b.setRepeatMode(i12);
    }

    public final void setScaleType(@k ImageView.ScaleType scaleType) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178340b.setScaleType(scaleType);
    }

    public final void setSpeed(float f12) {
        com.avito.android.lib.design.animation.d dVar = this.f178268d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f178340b.setSpeed(f12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnimationView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.animationView : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.autoPlay = true;
        this.f178273i = new com.avito.android.lib.design.animation.a(this);
        LayoutInflater.from(context).inflate(R.layout.design_animation_view_layout, (ViewGroup) this, true);
        this.f178266b = (ViewGroup) findViewById(R.id.container);
        this.f178267c = (ImageView) findViewById(R.id.fallback_imageview);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178998v, i12, i13);
        f(typedArrayObtainStyledAttributes.hasValue(4) ? EngineType.values()[typedArrayObtainStyledAttributes.getInt(4, 0)] : EngineType.f178278b);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
