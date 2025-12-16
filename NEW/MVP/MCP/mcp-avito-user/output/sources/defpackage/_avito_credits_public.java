package defpackage;

import PK0.h;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.badge.e;
import com.avito.android.lib.util.y;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PriceDescriptionBadgeUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_credits_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: f, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class _avito_credits_public {

    /* compiled from: PriceDescriptionBadgeUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f395496a;

        static {
            int[] iArr = new int[LoanTerms.PriceInfo.PriceBadge.Type.values().length];
            try {
                iArr[LoanTerms.PriceInfo.PriceBadge.Type.RED_BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoanTerms.PriceInfo.PriceBadge.Type.QUESTION_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f395496a = iArr;
        }
    }

    /* compiled from: PriceDescriptionBadgeUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f$b */
    public static final class b implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f395501b;

        public b(l lVar) {
            this.f395501b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return L.f(this.f395501b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f395501b;
        }

        public final int hashCode() {
            return this.f395501b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f395501b.invoke(deepLink);
        }
    }

    @k
    public static final CharSequence a(@k CharSequence charSequence, @k Context context, @Y61.l DeepLink deepLink, @k l<? super DeepLink, G0> lVar) {
        Drawable drawableM = C35835l0.m(context, R.attr.ic_help16, R.attr.gray54);
        if (drawableM == null) {
            return charSequence;
        }
        drawableM.setBounds(0, 0, drawableM.getIntrinsicWidth(), drawableM.getIntrinsicHeight());
        y yVar = new y(drawableM);
        OK0.b bVar = deepLink != null ? new OK0.b(deepLink, new b(lVar), false) : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(" ", new h(y6.b(4)), 33);
        spannableStringBuilder.append("_", yVar, 33);
        spannableStringBuilder.setSpan(bVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableString] */
    @k
    public static final CharSequence b(@k CharSequence charSequence, @k Context context, @Y61.l String str, @Y61.l DeepLink deepLink, @k l<? super DeepLink, G0> lVar) {
        CharSequence charSequenceE = str != null ? FV.a.f4720a.e(str, context, R.attr.textIconChevronRight, y6.b(5)) : null;
        if (charSequenceE != null) {
            String string = charSequence.toString();
            int length = string.length();
            int i12 = length + 1;
            charSequence = e.c(string, charSequenceE, context, 96);
            OK0.b bVar = deepLink != null ? new OK0.b(deepLink, new b(lVar), false) : null;
            charSequence.setSpan(new h(y6.b(8)), length, i12, 33);
            charSequence.setSpan(bVar, i12, charSequenceE.length() + i12, 33);
        }
        return charSequence;
    }
}
