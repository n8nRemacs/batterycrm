package com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: SelectAddressItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class k extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextView f242871l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f242872m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TextView textView, String str) {
        super(0);
        this.f242871l = textView;
        this.f242872m = str;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        TextView textView = this.f242871l;
        boolean z12 = true;
        if (textView.getLayout().getEllipsisCount(1) != 0) {
            CharSequence text = textView.getText();
            while (textView.getLayout().getEllipsisCount(1) > 0) {
                text = C43066x.A0(text.subSequence(0, text.length() - 1).toString()).toString();
                textView.setText(text);
            }
            String strConcat = "…".concat(this.f242872m);
            textView.setText(text.subSequence(0, (text.length() - 1) - strConcat.length()).toString() + strConcat);
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
