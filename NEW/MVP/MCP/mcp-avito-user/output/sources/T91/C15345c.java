package T91;

import B91.C13115h;
import B91.H;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatEditText;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* renamed from: T91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15345c implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f15444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15445c;

    public C15345c(H h12, ru.mts.biometry.sdk.feature.documentResult.ui.h hVar) {
        this.f15444b = h12;
        this.f15445c = hVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        C15344b c15344b = (C15344b) obj;
        H h12 = this.f15444b;
        boolean zF2 = L.f(h12.f1052j.getText(), c15344b.f15441b);
        String str = c15344b.f15441b;
        if (!zF2) {
            h12.f1052j.setText(str);
        }
        h12.f1052j.setEnabled(c15344b.f15442c);
        C15343a c15343a = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
        if (((Boolean) this.f15445c.f436455j0.getValue()).booleanValue() && str == null) {
            H91.g.c(h12.f1054l);
        } else {
            H91.g.b(h12.f1054l);
        }
        if (c15344b.f15443d) {
            h12.f1046d.setEnabled(false);
            SdkBioEditText sdkBioEditText = h12.f1052j;
            C13115h c13115h = sdkBioEditText.f436532b;
            c13115h.f1119d.setTextColor(com.google.android.material.color.k.b(sdkBioEditText.getContext(), R.attr.sdkBioErrorColor, -65536));
            int iB2 = com.google.android.material.color.k.b(sdkBioEditText.getContext(), R.attr.sdkBioErrorColor, -65536);
            AppCompatEditText appCompatEditText = c13115h.f1117b;
            appCompatEditText.setTextColor(iB2);
            c13115h.f1118c.setTextColor(com.google.android.material.color.k.b(sdkBioEditText.getContext(), R.attr.sdkBioErrorColor, -65536));
            Context context = sdkBioEditText.getContext();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.sdkBioFieldErrorIcon, typedValue, true);
            appCompatEditText.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, typedValue.resourceId, 0);
            Resources resources = sdkBioEditText.getResources();
            Resources.Theme theme = sdkBioEditText.getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            appCompatEditText.setBackground(resources.getDrawable(R.drawable.sdk_bio_edittext_error, theme));
        } else {
            h12.f1046d.setEnabled(true);
            SdkBioEditText sdkBioEditText2 = h12.f1052j;
            C13115h c13115h2 = sdkBioEditText2.f436532b;
            c13115h2.f1119d.setTextColor(com.google.android.material.color.k.b(sdkBioEditText2.getContext(), R.attr.sdkBioTextSecondaryColor, -16777216));
            int iB3 = com.google.android.material.color.k.b(sdkBioEditText2.getContext(), R.attr.sdkBioTextPrimaryColor, -16777216);
            AppCompatEditText appCompatEditText2 = c13115h2.f1117b;
            appCompatEditText2.setTextColor(iB3);
            c13115h2.f1118c.setTextColor(com.google.android.material.color.k.b(sdkBioEditText2.getContext(), R.attr.sdkBioTextSecondaryColor, -16777216));
            appCompatEditText2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            Resources resources2 = sdkBioEditText2.getResources();
            Resources.Theme theme2 = sdkBioEditText2.getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal2 = androidx.core.content.res.i.f44673a;
            appCompatEditText2.setBackground(resources2.getDrawable(R.drawable.sdk_bio_edittext_normal, theme2));
        }
        return G0.f406611a;
    }
}
