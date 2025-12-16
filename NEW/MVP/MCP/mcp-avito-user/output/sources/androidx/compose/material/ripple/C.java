package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.ui.graphics.T;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleHostView.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/ripple/C;", "Landroid/graphics/drawable/RippleDrawable;", "a", "b", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C extends RippleDrawable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34052b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public T f34053c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Integer f34054d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34055e;

    /* compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/C$a;", "", "<init>", "()V", "", "setMaxRadiusFetched", "Z", "Ljava/lang/reflect/Method;", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/ripple/C$b;", "", "<init>", "()V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f34056a = new b();
    }

    static {
        new a(null);
    }

    public C(boolean z12) {
        super(ColorStateList.valueOf(-16777216), null, z12 ? new ColorDrawable(-1) : null);
        this.f34052b = z12;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @Y61.k
    public final Rect getDirtyBounds() {
        if (!this.f34052b) {
            this.f34055e = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f34055e = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f34055e;
    }
}
