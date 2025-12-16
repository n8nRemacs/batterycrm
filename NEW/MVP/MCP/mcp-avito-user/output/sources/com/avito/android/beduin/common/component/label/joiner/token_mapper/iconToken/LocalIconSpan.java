package com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.appcompat.app.r;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;

/* compiled from: LocalIconSpan.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/iconToken/LocalIconSpan;", "Landroid/text/style/ImageSpan;", "Alignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocalIconSpan extends ImageSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Drawable f101675b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Alignment f101676c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101677d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalIconSpan.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/iconToken/LocalIconSpan$Alignment;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        /* renamed from: b, reason: collision with root package name */
        public static final Alignment f101678b;

        /* renamed from: c, reason: collision with root package name */
        public static final Alignment f101679c;

        /* renamed from: d, reason: collision with root package name */
        public static final Alignment f101680d;

        /* renamed from: e, reason: collision with root package name */
        public static final Alignment f101681e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f101682f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101683g;

        static {
            Alignment alignment = new Alignment("TOP", 0);
            f101678b = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            f101679c = alignment2;
            Alignment alignment3 = new Alignment("BASELINE", 2);
            f101680d = alignment3;
            Alignment alignment4 = new Alignment("BOTTOM", 3);
            f101681e = alignment4;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3, alignment4};
            f101682f = alignmentArr;
            f101683g = c.a(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f101682f.clone();
        }
    }

    /* compiled from: LocalIconSpan.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Alignment alignment = Alignment.f101678b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Alignment alignment2 = Alignment.f101678b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Alignment alignment3 = Alignment.f101678b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LocalIconSpan(@k Drawable drawable, @k Alignment alignment, int i12) {
        super(drawable);
        this.f101675b = drawable;
        this.f101676c = alignment;
        this.f101677d = i12;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @l CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        int i17;
        canvas.save();
        int iOrdinal = this.f101676c.ordinal();
        Drawable drawable = this.f101675b;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i16 -= drawable.getBounds().bottom;
                    i17 = paint.getFontMetricsInt().descent;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i17 = drawable.getBounds().bottom;
                }
                i14 = i16 - i17;
            } else {
                i14 = r.f(i16, i14, 2, i14) - (getDrawable().getBounds().height() / 2);
            }
        }
        canvas.translate(f12, i14 - y6.b(this.f101677d));
        drawable.draw(canvas);
        canvas.restore();
    }
}
