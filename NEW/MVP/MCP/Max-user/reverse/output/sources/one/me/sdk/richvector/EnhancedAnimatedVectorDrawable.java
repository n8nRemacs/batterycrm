package one.me.sdk.richvector;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import defpackage.bg5;
import defpackage.cg5;
import defpackage.dg5;
import defpackage.laj;
import defpackage.le;
import defpackage.mzg;
import defpackage.ue3;
import defpackage.wf;
import defpackage.xf;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Keep
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0002Re\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0001aB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020+2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0010J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\u0010J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\u0010J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010#J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010#J\u000f\u0010=\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020+2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010#J\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010#J\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010L\u001a\u00020FH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\fH\u0016¢\u0006\u0004\bP\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0014\u0010@\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020H0Wj\b\u0012\u0004\u0012\u00020H`X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020F0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020?0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010ZR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006h"}, d2 = {"Lone/me/sdk/richvector/EnhancedAnimatedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Canvas;", "canvas", "Lqqg;", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getColorFilter", "()Landroid/graphics/ColorFilter;", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "jumpToCurrentState", "()V", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "state", "", "onStateChange", "([I)Z", "level", "onLevelChange", "(I)Z", "visible", "restart", "setVisible", "(ZZ)Z", "getDirtyBounds", "()Landroid/graphics/Rect;", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "start", "stop", "isRunning", "()Z", "Lle;", "callback", "registerAnimationCallback", "(Lle;)V", "unregisterAnimationCallback", "(Lle;)Z", "clearAnimationCallbacks", "", "targetName", "Landroid/animation/Animator;", "findAnimations", "(Ljava/lang/String;)Landroid/animation/Animator;", "invalidateAnimations", SdkMetricStatEvent.NAME_KEY, "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "I", "dg5", "Ldg5;", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "drawable", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "animators", "Ljava/util/ArrayList;", "Landroid/util/ArrayMap;", "targetNameMap", "Landroid/util/ArrayMap;", "Landroid/animation/AnimatorSet;", "animatorSetFromXml", "Landroid/animation/AnimatorSet;", "Lbg5;", "animator", "Lbg5;", "animationCallbacks", "cg5", "animatorListener", "Lcg5;", "rich-vector_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnhancedAnimatedVectorDrawable extends Drawable implements Animatable, mzg {
    private final ArrayList<le> animationCallbacks;
    private bg5 animator;
    private final cg5 animatorListener;
    private AnimatorSet animatorSetFromXml;
    private final ArrayList<Animator> animators;
    private final dg5 callback;
    private final EnhancedVectorDrawable drawable;
    private final int resId;
    private final ArrayMap<Animator, String> targetNameMap;

    public EnhancedAnimatedVectorDrawable(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        this.resId = i;
        dg5 dg5Var = new dg5(this);
        this.callback = dg5Var;
        this.animationCallbacks = new ArrayList<>();
        this.animatorListener = new cg5(this);
        wf wfVarB = new xf(context).b(i);
        EnhancedVectorDrawable enhancedVectorDrawable = wfVarB.a;
        enhancedVectorDrawable.setCallback(dg5Var);
        this.drawable = enhancedVectorDrawable;
        ArrayList<Animator> arrayList = wfVarB.b;
        this.animators = arrayList;
        ArrayMap<Animator, String> arrayMap = wfVarB.c;
        this.targetNameMap = arrayMap;
        AnimatorSet animatorSet = new AnimatorSet();
        laj.d(enhancedVectorDrawable, animatorSet, arrayList, arrayMap);
        this.animatorSetFromXml = animatorSet;
        this.animator = new bg5(this, animatorSet);
    }

    public void clearAnimationCallbacks() {
        bg5 bg5Var = this.animator;
        bg5Var.b.removeListener(this.animatorListener);
        this.animationCallbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        bg5 bg5Var = this.animator;
        if (bg5Var.b.isStarted()) {
            bg5Var.a.invalidateSelf();
        }
        this.drawable.draw(canvas);
    }

    public Animator findAnimations(String targetName) {
        Integer numValueOf = Integer.valueOf(ue3.K(this.targetNameMap.values(), targetName));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.targetNameMap.keyAt(numValueOf.intValue());
    }

    @Override // defpackage.mzg
    public VectorPath findPath(String name) {
        return this.drawable.findPath(name);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.drawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.drawable.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void invalidateAnimations() {
        AnimatorSet animatorSet = new AnimatorSet();
        laj.d(this.drawable, animatorSet, this.animators, this.targetNameMap);
        this.animatorSetFromXml = animatorSet;
        bg5 bg5Var = this.animator;
        bg5Var.b.removeListener(this.animatorListener);
        bg5 bg5Var2 = new bg5(this, this.animatorSetFromXml);
        if (this.animationCallbacks.size() != 0) {
            bg5Var2.b.addListener(this.animatorListener);
        }
        this.animator = bg5Var2;
    }

    @Override // defpackage.mzg
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animator.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.animator.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawable.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        return this.drawable.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        return this.drawable.setState(state);
    }

    public void registerAnimationCallback(le callback) {
        if (this.animationCallbacks.size() == 0) {
            bg5 bg5Var = this.animator;
            bg5Var.b.addListener(this.animatorListener);
        }
        if (this.animationCallbacks.contains(callback)) {
            return;
        }
        this.animationCallbacks.add(callback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawable.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.drawable.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.drawable.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        bg5 bg5Var = this.animator;
        if (bg5Var.c && bg5Var.b.isStarted()) {
            if (visible) {
                this.animator.b.resume();
            } else {
                this.animator.b.pause();
            }
        }
        this.drawable.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        bg5 bg5Var = this.animator;
        AnimatorSet animatorSet = bg5Var.b;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
        bg5Var.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animator.b.end();
    }

    public boolean unregisterAnimationCallback(le callback) {
        boolean zRemove = this.animationCallbacks.remove(callback);
        if (this.animationCallbacks.size() == 0) {
            bg5 bg5Var = this.animator;
            bg5Var.b.removeListener(this.animatorListener);
        }
        return zRemove;
    }
}
