package com.avito.android.lib.design.input;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoEditText.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/a;", "Landroidx/appcompat/widget/AppCompatEditText;", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class a extends AppCompatEditText {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f179382c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final AvitoLayoutInflater.c f179383d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AvitoLayoutInflater.c f179384e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f179385b;

    /* compiled from: AvitoEditText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.input.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5280a extends C42801a implements Y41.p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C5280a f179386b = new C5280a();

        public C5280a() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet, 0, 4, null);
        }
    }

    /* compiled from: AvitoEditText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f179387b = new b();

        public b() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet, 0, 4, null);
        }
    }

    /* compiled from: AvitoEditText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/a$c;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        AvitoLayoutInflater.f181382a.getClass();
        f179383d = AvitoLayoutInflater.a(b.f179387b, AvitoLayoutInflater.f181387f);
        f179384e = AvitoLayoutInflater.a(C5280a.f179386b, AvitoLayoutInflater.f181388g);
    }

    @X41.j
    public a(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z12, int i12, @Y61.l Rect rect) {
        int inputType;
        if (Build.VERSION.SDK_INT <= 29 && ((inputType = getInputType()) == 32 || inputType == 33 || inputType == 208 || inputType == 209)) {
            if (this.f179385b.contains(Build.BRAND.toLowerCase(Locale.ROOT))) {
                setCursorVisible(false);
            }
        }
        super.onFocusChanged(z12, i12, rect);
    }

    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.editTextStyle : i12);
        this.f179385b = C42756l.l0(new String[]{"redmi", Constants.REFERRER_API_XIAOMI, "poco", "pocophone"});
    }
}
