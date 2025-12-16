package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.B;
import com.airbnb.lottie.N;
import j.InterfaceC42165v;
import j.InterfaceC42167x;
import j.V;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: o, reason: collision with root package name */
    public static final C27288h f59116o = new C27288h();

    /* renamed from: b, reason: collision with root package name */
    public final E<C27291k> f59117b;

    /* renamed from: c, reason: collision with root package name */
    public final E<Throwable> f59118c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public E<Throwable> f59119d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42165v
    public int f59120e;

    /* renamed from: f, reason: collision with root package name */
    public final B f59121f;

    /* renamed from: g, reason: collision with root package name */
    public String f59122g;

    /* renamed from: h, reason: collision with root package name */
    @V
    public int f59123h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f59124i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59125j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59126k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f59127l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f59128m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public J<C27291k> f59129n;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public String f59130b;

        /* renamed from: c, reason: collision with root package name */
        public int f59131c;

        /* renamed from: d, reason: collision with root package name */
        public float f59132d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f59133e;

        /* renamed from: f, reason: collision with root package name */
        public String f59134f;

        /* renamed from: g, reason: collision with root package name */
        public int f59135g;

        /* renamed from: h, reason: collision with root package name */
        public int f59136h;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(Parcel parcel, C27290j c27290j) {
            super(parcel);
            this.f59130b = parcel.readString();
            this.f59132d = parcel.readFloat();
            this.f59133e = parcel.readInt() == 1;
            this.f59134f = parcel.readString();
            this.f59135g = parcel.readInt();
            this.f59136h = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeString(this.f59130b);
            parcel.writeFloat(this.f59132d);
            parcel.writeInt(this.f59133e ? 1 : 0);
            parcel.writeString(this.f59134f);
            parcel.writeInt(this.f59135g);
            parcel.writeInt(this.f59136h);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f59137b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f59138c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f59139d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f59140e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f59141f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f59142g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a[] f59143h;

        static {
            a aVar = new a("SET_ANIMATION", 0);
            f59137b = aVar;
            a aVar2 = new a("SET_PROGRESS", 1);
            f59138c = aVar2;
            a aVar3 = new a("SET_REPEAT_MODE", 2);
            f59139d = aVar3;
            a aVar4 = new a("SET_REPEAT_COUNT", 3);
            f59140e = aVar4;
            a aVar5 = new a("SET_IMAGE_ASSETS", 4);
            f59141f = aVar5;
            a aVar6 = new a("PLAY_OPTION", 5);
            f59142g = aVar6;
            f59143h = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f59143h.clone();
        }
    }

    public static class b implements E<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f59144a;

        public b(LottieAnimationView lottieAnimationView) {
            this.f59144a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.E
        public final void onResult(Throwable th2) {
            Throwable th3 = th2;
            LottieAnimationView lottieAnimationView = this.f59144a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i12 = lottieAnimationView.f59120e;
            if (i12 != 0) {
                lottieAnimationView.setImageResource(i12);
            }
            E e12 = lottieAnimationView.f59119d;
            if (e12 == null) {
                e12 = LottieAnimationView.f59116o;
            }
            e12.onResult(th3);
        }
    }

    public static class c implements E<C27291k> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f59145a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f59145a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.E
        public final void onResult(C27291k c27291k) {
            C27291k c27291k2 = c27291k;
            LottieAnimationView lottieAnimationView = this.f59145a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c27291k2);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i12) {
        String string;
        super(context, attributeSet, i12);
        this.f59117b = new c(this);
        this.f59118c = new b(this);
        this.f59120e = 0;
        B b12 = new B();
        this.f59121f = b12;
        this.f59124i = false;
        this.f59125j = false;
        this.f59126k = true;
        HashSet hashSet = new HashSet();
        this.f59127l = hashSet;
        this.f59128m = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, N.c.f59151a, i12, 0);
        this.f59126k = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.f59125j = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            b12.f59036c.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f12 = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            hashSet.add(a.f59138c);
        }
        b12.y(f12);
        b12.i(typedArrayObtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            b12.a(new O2.d("**"), H.f59076F, new com.airbnb.lottie.value.j(new O(androidx.core.content.d.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i13 = typedArrayObtainStyledAttributes.getInt(17, 0);
            setRenderMode(RenderMode.values()[i13 >= RenderMode.values().length ? 0 : i13]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i14 = typedArrayObtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(AsyncUpdates.values()[i14 >= RenderMode.values().length ? 0 : i14]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(J<C27291k> j12) {
        I<C27291k> i12 = j12.f59114d;
        B b12 = this.f59121f;
        if (i12 != null && b12 == getDrawable() && b12.f59035b == i12.f59108a) {
            return;
        }
        this.f59127l.add(a.f59137b);
        this.f59121f.d();
        k();
        j12.b(this.f59117b);
        j12.a(this.f59118c);
        this.f59129n = j12;
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.f59121f.f59031Q;
        return asyncUpdates != null ? asyncUpdates : C27285e.f59570d;
    }

    public boolean getAsyncUpdatesEnabled() {
        AsyncUpdates asyncUpdates = this.f59121f.f59031Q;
        if (asyncUpdates == null) {
            asyncUpdates = C27285e.f59570d;
        }
        return asyncUpdates == AsyncUpdates.f59011c;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f59121f.f59059z;
    }

    public boolean getClipToCompositionBounds() {
        return this.f59121f.f59052s;
    }

    @j.P
    public C27291k getComposition() {
        Drawable drawable = getDrawable();
        B b12 = this.f59121f;
        if (drawable == b12) {
            return b12.f59035b;
        }
        return null;
    }

    public long getDuration() {
        C27291k composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f59121f.f59036c.f60114i;
    }

    @j.P
    public String getImageAssetsFolder() {
        return this.f59121f.f59043j;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f59121f.f59051r;
    }

    public float getMaxFrame() {
        return this.f59121f.f59036c.j();
    }

    public float getMinFrame() {
        return this.f59121f.f59036c.k();
    }

    @j.P
    public M getPerformanceTracker() {
        C27291k c27291k = this.f59121f.f59035b;
        if (c27291k != null) {
            return c27291k.f59582a;
        }
        return null;
    }

    @InterfaceC42167x
    public float getProgress() {
        return this.f59121f.f59036c.i();
    }

    public RenderMode getRenderMode() {
        return this.f59121f.f59016B ? RenderMode.f59156d : RenderMode.f59155c;
    }

    public int getRepeatCount() {
        return this.f59121f.f59036c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f59121f.f59036c.getRepeatMode();
    }

    public float getSpeed() {
        return this.f59121f.f59036c.f60110e;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof B) {
            boolean z12 = ((B) drawable).f59016B;
            RenderMode renderMode = RenderMode.f59156d;
            if ((z12 ? renderMode : RenderMode.f59155c) == renderMode) {
                this.f59121f.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@j.N Drawable drawable) {
        Drawable drawable2 = getDrawable();
        B b12 = this.f59121f;
        if (drawable2 == b12) {
            super.invalidateDrawable(b12);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void k() {
        J<C27291k> j12 = this.f59129n;
        if (j12 != null) {
            E<C27291k> e12 = this.f59117b;
            synchronized (j12) {
                j12.f59111a.remove(e12);
            }
            J<C27291k> j13 = this.f59129n;
            E<Throwable> e13 = this.f59118c;
            synchronized (j13) {
                j13.f59112b.remove(e13);
            }
        }
    }

    @j.K
    public final void l() {
        this.f59127l.add(a.f59142g);
        this.f59121f.n();
    }

    @j.K
    public final void m() {
        this.f59127l.add(a.f59142g);
        this.f59121f.p();
    }

    public final void n(String str, @j.P String str2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(C27296p.a(str2, new CallableC27287g(1, str2, byteArrayInputStream), new RunnableC27294n(byteArrayInputStream, 0)));
    }

    public final void o(String str, @j.P String str2) {
        setCompositionTask(C27296p.a(str2, new CallableC27292l(getContext(), str, str2, 0), null));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f59125j) {
            return;
        }
        this.f59121f.n();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i12;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f59122g = savedState.f59130b;
        HashSet hashSet = this.f59127l;
        a aVar = a.f59137b;
        if (!hashSet.contains(aVar) && !TextUtils.isEmpty(this.f59122g)) {
            setAnimation(this.f59122g);
        }
        this.f59123h = savedState.f59131c;
        if (!hashSet.contains(aVar) && (i12 = this.f59123h) != 0) {
            setAnimation(i12);
        }
        if (!hashSet.contains(a.f59138c)) {
            this.f59121f.y(savedState.f59132d);
        }
        if (!hashSet.contains(a.f59142g) && savedState.f59133e) {
            l();
        }
        if (!hashSet.contains(a.f59141f)) {
            setImageAssetsFolder(savedState.f59134f);
        }
        if (!hashSet.contains(a.f59139d)) {
            setRepeatMode(savedState.f59135g);
        }
        if (hashSet.contains(a.f59140e)) {
            return;
        }
        setRepeatCount(savedState.f59136h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z12;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f59130b = this.f59122g;
        savedState.f59131c = this.f59123h;
        B b12 = this.f59121f;
        savedState.f59132d = b12.f59036c.i();
        boolean zIsVisible = b12.isVisible();
        com.airbnb.lottie.utils.h hVar = b12.f59036c;
        if (zIsVisible) {
            z12 = hVar.f60119n;
        } else {
            B.b bVar = b12.f59040g;
            z12 = bVar == B.b.f59061c || bVar == B.b.f59062d;
        }
        savedState.f59133e = z12;
        savedState.f59134f = b12.f59043j;
        savedState.f59135g = hVar.getRepeatMode();
        savedState.f59136h = hVar.getRepeatCount();
        return savedState;
    }

    public void setAnimation(@V final int i12) {
        J<C27291k> jF2;
        J<C27291k> j12;
        this.f59123h = i12;
        this.f59122g = null;
        if (isInEditMode()) {
            j12 = new J<>(new Callable() { // from class: com.airbnb.lottie.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f59580b;
                    boolean z12 = lottieAnimationView.f59126k;
                    int i13 = i12;
                    if (!z12) {
                        return C27296p.g(lottieAnimationView.getContext(), i13, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return C27296p.g(context, i13, C27296p.l(i13, context));
                }
            }, true);
        } else {
            if (this.f59126k) {
                Context context = getContext();
                jF2 = C27296p.f(context, i12, C27296p.l(i12, context));
            } else {
                jF2 = C27296p.f(getContext(), i12, null);
            }
            j12 = jF2;
        }
        setCompositionTask(j12);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        n(str, null);
    }

    public void setAnimationFromUrl(String str) {
        J<C27291k> jA2;
        int i12 = 0;
        String str2 = null;
        if (this.f59126k) {
            Context context = getContext();
            HashMap map = C27296p.f59916a;
            String strF = androidx.camera.camera2.internal.G.f("url_", str);
            jA2 = C27296p.a(strF, new CallableC27292l(context, str, strF, i12), null);
        } else {
            jA2 = C27296p.a(null, new CallableC27292l(getContext(), str, str2, i12), null);
        }
        setCompositionTask(jA2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z12) {
        this.f59121f.f59057x = z12;
    }

    public void setApplyingShadowToLayersEnabled(boolean z12) {
        this.f59121f.f59058y = z12;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.f59121f.f59031Q = asyncUpdates;
    }

    public void setCacheComposition(boolean z12) {
        this.f59126k = z12;
    }

    public void setClipTextToBoundingBox(boolean z12) {
        B b12 = this.f59121f;
        if (z12 != b12.f59059z) {
            b12.f59059z = z12;
            b12.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z12) {
        this.f59121f.q(z12);
    }

    public void setComposition(@j.N C27291k c27291k) {
        boolean z12 = C27285e.f59567a;
        B b12 = this.f59121f;
        b12.setCallback(this);
        this.f59124i = true;
        boolean zR2 = b12.r(c27291k);
        if (this.f59125j) {
            b12.n();
        }
        this.f59124i = false;
        if (getDrawable() != b12 || zR2) {
            if (!zR2) {
                com.airbnb.lottie.utils.h hVar = b12.f59036c;
                boolean z13 = hVar != null ? hVar.f60119n : false;
                setImageDrawable(null);
                setImageDrawable(b12);
                if (z13) {
                    b12.p();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f59128m.iterator();
            while (it.hasNext()) {
                ((G) it.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        B b12 = this.f59121f;
        b12.f59047n = str;
        com.airbnb.lottie.manager.a aVarK = b12.k();
        if (aVarK != null) {
            aVarK.f59610e = str;
        }
    }

    public void setFailureListener(@j.P E<Throwable> e12) {
        this.f59119d = e12;
    }

    public void setFallbackResource(@InterfaceC42165v int i12) {
        this.f59120e = i12;
    }

    public void setFontAssetDelegate(C27263b c27263b) {
        this.f59121f.f59048o = c27263b;
    }

    public void setFontMap(@j.P Map<String, Typeface> map) {
        B b12 = this.f59121f;
        if (map == b12.f59046m) {
            return;
        }
        b12.f59046m = map;
        b12.invalidateSelf();
    }

    public void setFrame(int i12) {
        this.f59121f.s(i12);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z12) {
        this.f59121f.f59038e = z12;
    }

    public void setImageAssetDelegate(InterfaceC27264c interfaceC27264c) {
        B b12 = this.f59121f;
        b12.f59044k = interfaceC27264c;
        com.airbnb.lottie.manager.b bVar = b12.f59042i;
        if (bVar != null) {
            bVar.f59614c = interfaceC27264c;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f59121f.f59043j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f59123h = 0;
        this.f59122g = null;
        k();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f59123h = 0;
        this.f59122g = null;
        k();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i12) {
        this.f59123h = 0;
        this.f59122g = null;
        k();
        super.setImageResource(i12);
    }

    public void setMaintainOriginalImageBounds(boolean z12) {
        this.f59121f.f59051r = z12;
    }

    public void setMaxFrame(int i12) {
        this.f59121f.t(i12);
    }

    public void setMaxProgress(@InterfaceC42167x float f12) {
        B b12 = this.f59121f;
        C27291k c27291k = b12.f59035b;
        if (c27291k == null) {
            b12.f59041h.add(new w(b12, f12, 0));
            return;
        }
        float f13 = com.airbnb.lottie.utils.j.f(c27291k.f59593l, c27291k.f59594m, f12);
        com.airbnb.lottie.utils.h hVar = b12.f59036c;
        hVar.o(hVar.f60116k, f13);
    }

    public void setMinAndMaxFrame(String str) {
        this.f59121f.v(str);
    }

    public void setMinFrame(int i12) {
        this.f59121f.w(i12);
    }

    public void setMinProgress(float f12) {
        B b12 = this.f59121f;
        C27291k c27291k = b12.f59035b;
        if (c27291k == null) {
            b12.f59041h.add(new w(b12, f12, 1));
        } else {
            b12.w((int) com.airbnb.lottie.utils.j.f(c27291k.f59593l, c27291k.f59594m, f12));
        }
    }

    public void setOutlineMasksAndMattes(boolean z12) {
        B b12 = this.f59121f;
        if (b12.f59056w == z12) {
            return;
        }
        b12.f59056w = z12;
        com.airbnb.lottie.model.layer.c cVar = b12.f59053t;
        if (cVar != null) {
            cVar.r(z12);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z12) {
        B b12 = this.f59121f;
        b12.f59055v = z12;
        C27291k c27291k = b12.f59035b;
        if (c27291k != null) {
            c27291k.f59582a.f59148a = z12;
        }
    }

    public void setProgress(@InterfaceC42167x float f12) {
        this.f59127l.add(a.f59138c);
        this.f59121f.y(f12);
    }

    public void setRenderMode(RenderMode renderMode) {
        B b12 = this.f59121f;
        b12.f59015A = renderMode;
        b12.e();
    }

    public void setRepeatCount(int i12) {
        this.f59127l.add(a.f59140e);
        this.f59121f.f59036c.setRepeatCount(i12);
    }

    public void setRepeatMode(int i12) {
        this.f59127l.add(a.f59139d);
        this.f59121f.f59036c.setRepeatMode(i12);
    }

    public void setSafeMode(boolean z12) {
        this.f59121f.f59039f = z12;
    }

    public void setSpeed(float f12) {
        this.f59121f.f59036c.f60110e = f12;
    }

    public void setTextDelegate(P p12) {
        this.f59121f.f59049p = p12;
    }

    public void setUseCompositionFrameRate(boolean z12) {
        this.f59121f.f59036c.f60120o = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            boolean r0 = r4.f59124i
            r1 = 0
            if (r0 != 0) goto L19
            com.airbnb.lottie.B r2 = r4.f59121f
            if (r5 != r2) goto L19
            com.airbnb.lottie.utils.h r3 = r2.f59036c
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.f60119n
        L11:
            if (r3 == 0) goto L19
            r4.f59125j = r1
            r2.m()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof com.airbnb.lottie.B
            if (r0 == 0) goto L2e
            r0 = r5
            com.airbnb.lottie.B r0 = (com.airbnb.lottie.B) r0
            com.airbnb.lottie.utils.h r2 = r0.f59036c
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.f60119n
        L29:
            if (r1 == 0) goto L2e
            r0.m()
        L2e:
            super.unscheduleDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setMaxFrame(String str) {
        this.f59121f.u(str);
    }

    public void setMinFrame(String str) {
        this.f59121f.x(str);
    }

    public void setAnimation(String str) {
        J<C27291k> jA2;
        J<C27291k> j12;
        int i12 = 1;
        this.f59122g = str;
        int i13 = 0;
        this.f59123h = 0;
        if (isInEditMode()) {
            j12 = new J<>(new CallableC27287g(i13, str, this), true);
        } else {
            String str2 = null;
            if (this.f59126k) {
                Context context = getContext();
                HashMap map = C27296p.f59916a;
                String strF = androidx.camera.camera2.internal.G.f("asset_", str);
                jA2 = C27296p.a(strF, new CallableC27292l(context.getApplicationContext(), str, strF, i12), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = C27296p.f59916a;
                jA2 = C27296p.a(null, new CallableC27292l(context2.getApplicationContext(), str, str2, i12), null);
            }
            j12 = jA2;
        }
        setCompositionTask(j12);
    }
}
