package com.avito.android.profile.logout_view;

import UU.a;
import Va0.C15660a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.d;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileLogoutView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/profile/logout_view/ProfileLogoutView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/G0;", "setLoginButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "LUU/a;", "newState", "setLoginButtonState", "(LUU/a;)V", "", "text", "setDescriptionText", "(Ljava/lang/CharSequence;)V", "_avito_profile_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileLogoutView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f222420b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f222421c;

    @j
    public ProfileLogoutView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setDescriptionText(@l CharSequence text) {
        this.f222420b.setText(text);
    }

    public final void setLoginButtonClickListener(@l View.OnClickListener listener) {
        this.f222421c.setOnClickListener(listener);
    }

    public final void setLoginButtonState(@k a newState) {
        this.f222421c.setState(newState);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileLogoutView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        int i15;
        Context dVar = context;
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i16 = (i14 & 4) != 0 ? R.attr.profileLogoutView : i12;
        int i17 = (i14 & 8) != 0 ? R.style.ProfileLogoutViewBaseStyle : i13;
        if (!(dVar instanceof d) || ((i15 = ((d) dVar).f21657a) != 2132024969 && i15 != 2132024957)) {
            dVar = new d(dVar, R.style.Theme_DesignSystem_LookAndFeel);
        }
        super(dVar, attributeSet2, i16, i17);
        View.inflate(getContext(), R.layout.profile_logout_view, this);
        TextView textView = (TextView) findViewById(R.id.profile_logout_description);
        this.f222420b = textView;
        Button button = (Button) findViewById(R.id.profile_logout_login_button);
        this.f222421c = button;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, C15660a.f.f17204b, i16, i17);
        String string = typedArrayObtainStyledAttributes.getString(0);
        button.setState(new a(string == null ? "" : string, null, false, false, false, null, null, null, null, false, 1022, null));
        textView.setText(typedArrayObtainStyledAttributes.getString(1));
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        setGravity(17);
    }
}
