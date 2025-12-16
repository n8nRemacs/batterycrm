package com.avito.android.publish.slots.information_with_user_id.item;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: InformationWithUserIdItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/information_with_user_id/item/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f244342b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f244343c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f244344d;

    public f(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f244342b = aVar;
        TextView textView = (TextView) view;
        this.f244343c = textView;
        this.f244344d = view.getContext();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
