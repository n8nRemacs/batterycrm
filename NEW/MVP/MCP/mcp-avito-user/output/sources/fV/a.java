package FV;

import PK0.h;
import PK0.j;
import Y61.k;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.avito.android.lib.util.f;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import j.U;
import kotlin.Metadata;

/* compiled from: TextIconHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFV/a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f4720a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f4721b = y6.b(2);

    public static void a(a aVar, TextView textView, Integer num) {
        aVar.getClass();
        if (num == null) {
            D6.w(textView);
        } else {
            D6.H(textView);
            c(textView, num.intValue());
        }
    }

    @k
    public static CharSequence b(@InterfaceC42150f int i12, @k Context context) {
        String strN = f.n(i12, context);
        if (strN == null) {
            return "";
        }
        SpannableString spannableString = new SpannableString(strN);
        spannableString.setSpan(new j(null, 1, null), 0, strN.length(), 33);
        return spannableString;
    }

    public static void c(@k TextView textView, @InterfaceC42150f int i12) {
        textView.setText(b(i12, textView.getContext()));
    }

    public static SpannableStringBuilder d(CharSequence charSequence, String str, @U int i12, Y41.a aVar) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) " ").append((CharSequence) str);
        spannableStringBuilderAppend.setSpan(new j(aVar), charSequence.length() + 1, str.length() + charSequence.length() + 1, 33);
        spannableStringBuilderAppend.setSpan(new h(i12), charSequence.length(), charSequence.length() + 1, 33);
        return spannableStringBuilderAppend;
    }

    public static SpannableStringBuilder h(String str, CharSequence charSequence, @U int i12) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(str).append((CharSequence) " ").append(charSequence);
        spannableStringBuilderAppend.setSpan(new j(null), 0, str.length(), 33);
        spannableStringBuilderAppend.setSpan(new h(i12), str.length(), str.length() + 1, 33);
        return spannableStringBuilderAppend;
    }

    @k
    public static CharSequence i(@k CharSequence charSequence, @k Context context, @InterfaceC42150f int i12, @U int i13) {
        String strN = f.n(i12, context);
        return strN == null ? charSequence : h(strN, charSequence, i13);
    }

    public static void j(@k TextView textView, @InterfaceC42150f int i12, @U int i13) {
        textView.setText(i(textView.getText(), textView.getContext(), i12, i13));
    }

    public static /* synthetic */ void k(a aVar, TextView textView, int i12) {
        aVar.getClass();
        j(textView, i12, f4721b);
    }

    @k
    public final CharSequence e(@k CharSequence charSequence, @k Context context, @InterfaceC42150f int i12, @U int i13) {
        String strN = f.n(i12, context);
        return strN == null ? charSequence : d(charSequence, strN, i13, null);
    }

    public final void f(@k TextView textView, @InterfaceC42150f int i12, @U int i13) {
        textView.setText(e(textView.getText(), textView.getContext(), i12, i13));
    }
}
