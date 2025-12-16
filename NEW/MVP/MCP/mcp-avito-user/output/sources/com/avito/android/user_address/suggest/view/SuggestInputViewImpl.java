package com.avito.android.user_address.suggest.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.map.search.A;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestInputView.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/user_address/suggest/view/SuggestInputViewImpl;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/user_address/suggest/view/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestInputViewImpl extends FrameLayout implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f308154c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f308155b;

    public SuggestInputViewImpl(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.suggest_input_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.query);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f308155b = input;
        input.setOnEditorActionListener(new A(1));
    }

    @k
    public String getText() {
        return String.valueOf(this.f308155b.m53getText());
    }

    public void setText(@k String str) {
        Input.t(this.f308155b, str, false, 6);
    }
}
