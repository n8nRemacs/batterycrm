package Ph;

import PK0.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.avito.android.beduin.common.utils.D;
import com.avito.android.beduin.network.model.FontProperties;
import com.avito.android.beduin.network.model.LabelTextAttributes;
import com.avito.android.beduin.network.model.LineHeightProperties;
import com.avito.android.beduin.network.model.TextLineProperty;
import com.avito.android.util.F5;
import com.avito.android.util.y6;
import ii.C41406b;
import ii.C41408d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;

/* compiled from: StyleExtractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPh/g;", "LPh/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.label.joiner.style_extractor.a f13240a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.label.joiner.style_extractor.e f13241b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.label.joiner.style_extractor.g f13242c;

    @Inject
    public g(@k com.avito.android.beduin.common.component.label.joiner.style_extractor.a aVar, @k com.avito.android.beduin.common.component.label.joiner.style_extractor.e eVar, @k com.avito.android.beduin.common.component.label.joiner.style_extractor.g gVar) {
        this.f13240a = aVar;
        this.f13241b = eVar;
        this.f13242c = gVar;
    }

    @Override // Ph.f
    @k
    public final ArrayList a(@k Context context, @l LabelTextAttributes labelTextAttributes, @l LabelTextAttributes labelTextAttributes2) {
        Float max;
        LineHeightProperties lineHeight;
        LineHeightProperties lineHeight2;
        FontProperties font = labelTextAttributes != null ? labelTextAttributes.getFont() : null;
        FontProperties font2 = labelTextAttributes2 != null ? labelTextAttributes2.getFont() : null;
        this.f13240a.getClass();
        if (font2 == null || (lineHeight2 = font2.getLineHeight()) == null || (max = lineHeight2.getMax()) == null) {
            max = (font == null || (lineHeight = font.getLineHeight()) == null) ? null : lineHeight.getMax();
        }
        C41406b c41406b = max != null ? new C41406b(y6.a(max.floatValue())) : null;
        F5 f5A = com.avito.android.beduin.common.component.label.joiner.style_extractor.a.a(context, font);
        F5 f5A2 = com.avito.android.beduin.common.component.label.joiner.style_extractor.a.a(context, font2);
        Typeface typeface = f5A2.f318604a;
        if (typeface == null) {
            typeface = f5A.f318604a;
        }
        Typeface typeface2 = typeface;
        ColorStateList colorStateList = f5A2.f318605b;
        if (colorStateList == null) {
            colorStateList = f5A.f318605b;
        }
        ColorStateList colorStateList2 = colorStateList;
        ColorStateList colorStateList3 = f5A2.f318606c;
        if (colorStateList3 == null) {
            colorStateList3 = f5A.f318606c;
        }
        ColorStateList colorStateList4 = colorStateList3;
        Float f12 = f5A2.f318607d;
        if (f12 == null) {
            f12 = f5A.f318607d;
        }
        Float f13 = f12;
        Typeface typeface3 = f5A2.f318610g;
        if (typeface3 == null) {
            typeface3 = f5A.f318610g;
        }
        C41408d c41408d = new C41408d(typeface2, colorStateList2, colorStateList4, f13, typeface3);
        Integer num = f5A2.f318608e;
        if (num == null) {
            num = f5A.f318608e;
        }
        ArrayList arrayListB = C42756l.B(new Object[]{num != null ? new d.a(num.intValue()) : null, c41408d, c41406b});
        TextLineProperty strikethrough = labelTextAttributes != null ? labelTextAttributes.getStrikethrough() : null;
        TextLineProperty strikethrough2 = labelTextAttributes2 != null ? labelTextAttributes2.getStrikethrough() : null;
        this.f13241b.getClass();
        List listSingletonList = ((strikethrough != null ? D.a(strikethrough, context) : null) == null && (strikethrough2 != null ? D.a(strikethrough2, context) : null) == null) ? C42784z0.f406748b : Collections.singletonList(new StrikethroughSpan());
        TextLineProperty underline = labelTextAttributes != null ? labelTextAttributes.getUnderline() : null;
        TextLineProperty underline2 = labelTextAttributes2 != null ? labelTextAttributes2.getUnderline() : null;
        this.f13242c.getClass();
        return C42745f0.H(C42756l.B(new List[]{arrayListB, listSingletonList, ((underline != null ? D.a(underline, context) : null) == null && (underline2 != null ? D.a(underline2, context) : null) == null) ? C42784z0.f406748b : Collections.singletonList(new UnderlineSpan())}));
    }
}
