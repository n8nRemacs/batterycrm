package com.avito.android.advert_details_items.address;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsAddressView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextView f84458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f84459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CharSequence f84460n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TextView textView, int i12, CharSequence charSequence) {
        super(0);
        this.f84458l = textView;
        this.f84459m = i12;
        this.f84460n = charSequence;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12 = false;
        TextView textView = this.f84458l;
        Layout layout = textView.getLayout();
        int i12 = this.f84459m - 1;
        if (layout.getEllipsisCount(i12) != 0) {
            CharSequence text = textView.getText();
            while (textView.getLayout().getEllipsisCount(i12) > 0) {
                text = C43066x.A0(text.subSequence(0, text.length() - 1).toString()).toString();
                textView.setText(text);
            }
            CharSequence charSequenceConcat = TextUtils.concat("…", this.f84460n);
            textView.setText(TextUtils.concat(text.subSequence(0, (text.length() - 1) - charSequenceConcat.length()).toString(), charSequenceConcat));
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
