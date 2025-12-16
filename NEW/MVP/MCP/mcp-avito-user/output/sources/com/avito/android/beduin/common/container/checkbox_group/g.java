package com.avito.android.beduin.common.container.checkbox_group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupOptionView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/g;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "getOptionId", "()Ljava/lang/String;", "", "isChecked", "Lkotlin/G0;", "setChecked", "(Z)V", "Lcom/avito/android/beduin/common/container/checkbox_group/g$a;", "listener", "setOnCheckedChangeListener", "(Lcom/avito/android/beduin/common/container/checkbox_group/g$a;)V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f102979e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Checkbox f102980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutCompat f102981c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public a f102982d;

    /* compiled from: BeduinCheckboxGroupOptionView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/g$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k String str, boolean z12);
    }

    public g(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_checkbox_group_option_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.checkbox_group_option_selector);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f102980b = (Checkbox) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.checkbox_group_option_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        }
        this.f102981c = (LinearLayoutCompat) viewFindViewById2;
        setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 13));
    }

    @Y61.l
    public final String getOptionId() {
        String string = getTag().toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }

    public final void setChecked(boolean isChecked) {
        this.f102980b.setChecked(isChecked);
    }

    public final void setOnCheckedChangeListener(@Y61.k a listener) {
        this.f102982d = listener;
    }
}
