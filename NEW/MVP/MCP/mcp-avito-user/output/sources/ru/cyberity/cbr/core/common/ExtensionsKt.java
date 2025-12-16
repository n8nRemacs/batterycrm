package ru.cyberity.cbr.core.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.model.CBRSupportItem;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.BaseActivity;
import ru.cyberity.cbr.core.presentation.base.text.span.URLSpanNoUnderline;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\r2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001a\u001a\u00020\u0017*\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001f\u001a\u00020\u001c*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0017\u0010#\u001a\u0004\u0018\u00010 *\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "onClicked", "handleUrlClicks", "(Landroid/widget/TextView;LY41/l;)V", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "Landroid/content/Context;", "context", "", "resolve", "(Lru/cyberity/cbr/core/data/model/CBRSupportItem;Landroid/content/Context;)Z", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "", "keys", "", "getByPriority", "(Lru/cyberity/cbr/core/data/source/dynamic/c$c;[Ljava/lang/String;)Ljava/lang/CharSequence;", "isRequired", "formatRequired", "(Ljava/lang/CharSequence;Landroid/content/Context;Z)Ljava/lang/CharSequence;", "Landroid/content/res/TypedArray;", "", "index", "default", "getStyledColor", "(Landroid/content/res/TypedArray;II)I", "", "getDp", "(I)F", "dp", "Lcom/squareup/picasso/Picasso;", "getPicasso", "(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;", "picasso", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class ExtensionsKt {

    /* compiled from: Extensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CBRSupportItem.Type.values().length];
            iArr[CBRSupportItem.Type.Url.ordinal()] = 1;
            iArr[CBRSupportItem.Type.Email.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Y61.k
    public static final CharSequence formatRequired(@Y61.k CharSequence charSequence, @Y61.k Context context, boolean z12) {
        if (!z12) {
            return charSequence;
        }
        return new SpannableStringBuilder(charSequence).append(" *", new ForegroundColorSpan(s.a(context, R.attr.colorOnError)), 33);
    }

    @Y61.k
    public static final CharSequence getByPriority(@Y61.l c.C12476c c12476c, @Y61.k String... strArr) {
        if (c12476c == null) {
            return "";
        }
        for (String str : strArr) {
            String strA = c12476c.a(str);
            if (strA != null && !C43066x.K(strA)) {
                return strA;
            }
        }
        return "";
    }

    public static final float getDp(int i12) {
        return i12 * Resources.getSystem().getDisplayMetrics().density;
    }

    @Y61.l
    public static final Picasso getPicasso(@Y61.k Context context) {
        ru.cyberity.cbr.core.b serviceLocator;
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity == null || (serviceLocator = baseActivity.getServiceLocator()) == null) {
            return null;
        }
        return serviceLocator.v();
    }

    @InterfaceC42156l
    public static final int getStyledColor(@Y61.k TypedArray typedArray, @j.g0 int i12, @InterfaceC42156l int i13) {
        if (typedArray.hasValue(i12)) {
            if (typedArray.peekValue(i12).type != 2) {
                return typedArray.getColor(i12, i13);
            }
            int resourceId = typedArray.getResourceId(i12, -1);
            if (resourceId != -1) {
                return typedArray.getColor(resourceId, i13);
            }
        }
        return i13;
    }

    public static final void handleUrlClicks(@Y61.k TextView textView, @Y61.l final Y41.l<? super String, G0> lVar) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(textView.getText());
        for (Object obj : spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), URLSpan.class)) {
            final URLSpan uRLSpan = (URLSpan) obj;
            spannableStringBuilderValueOf.setSpan(new URLSpanNoUnderline() { // from class: ru.cyberity.cbr.core.common.ExtensionsKt$handleUrlClicks$1$1$1
                @Override // android.text.style.ClickableSpan
                public void onClick(@Y61.k View widget) {
                    Y41.l<String, G0> lVar2 = lVar;
                    if (lVar2 != null) {
                        lVar2.invoke(uRLSpan.getURL());
                    }
                }
            }, spannableStringBuilderValueOf.getSpanStart(uRLSpan), spannableStringBuilderValueOf.getSpanEnd(uRLSpan), 17);
            spannableStringBuilderValueOf.removeSpan(uRLSpan);
        }
        textView.setText(spannableStringBuilderValueOf);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final boolean resolve(@Y61.k CBRSupportItem cBRSupportItem, @Y61.k Context context) {
        CBREventHandler eventHandler = n0.f432787a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new CBREvent.SupportItemClicked(cBRSupportItem.getType().name(), cBRSupportItem.getValue()));
        }
        if (cBRSupportItem.getOnClick() != null) {
            Y41.l<CBRSupportItem, G0> onClick = cBRSupportItem.getOnClick();
            if (onClick != null) {
                onClick.invoke(cBRSupportItem);
            }
            return true;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[cBRSupportItem.getType().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                return false;
            }
            return s.a(context, Uri.parse("mailto:" + cBRSupportItem.getValue()));
        }
        String value = cBRSupportItem.getValue();
        if (!C43066x.h0(value, "https://", false) && !C43066x.h0(value, "http://", false)) {
            value = "http://".concat(value);
        }
        return s.a(context, Uri.parse(value));
    }
}
