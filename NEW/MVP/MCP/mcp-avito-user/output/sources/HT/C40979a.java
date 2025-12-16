package ht;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChipAppearance.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-paid-cvs_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ht.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40979a {
    @SuppressLint({"UdfComponentUsage"})
    public static final void a(@k Button button, boolean z12) {
        button.setSelected(z12);
        Context context = button.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(f.e("medium"), context), d.n.f179004y);
        button.setAppearance(z12 ? typedArrayObtainStyledAttributes.getResourceId(32, R.style.Deprecated_Button_Appearance_Primary) : typedArrayObtainStyledAttributes.getResourceId(44, R.style.Deprecated_Button_Appearance_Default));
        typedArrayObtainStyledAttributes.recycle();
    }
}
