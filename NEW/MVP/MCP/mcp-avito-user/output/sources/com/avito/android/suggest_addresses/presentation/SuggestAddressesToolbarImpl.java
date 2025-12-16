package com.avito.android.suggest_addresses.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestAddressesToolbar.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/suggest_addresses/presentation/SuggestAddressesToolbarImpl;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/suggest_addresses/presentation/l;", "", "query", "Lkotlin/G0;", "setText", "(Ljava/lang/String;)V", "hint", "setHint", "", "isLoading", "setLoading", "(Z)V", "enabled", "setEnabled", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestAddressesToolbarImpl extends LinearLayout implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f291961f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f291962b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f291963c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f291964d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f291965e;

    @X41.j
    public SuggestAddressesToolbarImpl(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled == isEnabled()) {
            return;
        }
        super.setEnabled(enabled);
        this.f291962b.setEnabled(enabled);
    }

    public void setHint(@Y61.k String hint) {
        this.f291962b.setHint(hint);
    }

    public void setLoading(boolean isLoading) {
        this.f291962b.setLoading(isLoading);
    }

    public void setText(@Y61.k String query) {
        Input.t(this.f291962b, query, false, 6);
    }

    public SuggestAddressesToolbarImpl(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.suggest_addresses_search_view, (ViewGroup) this, true);
        Input input = (Input) findViewById(R.id.query);
        this.f291962b = input;
        ImageView imageView = (ImageView) findViewById(R.id.back);
        this.f291963c = imageView;
        imageView.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 15));
        input.setOnEditorActionListener(new C27140f(this, 11));
    }
}
