package com.avito.android.publish.drafts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishMessageHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/L;", "Lcom/avito/android/publish/drafts/K;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class L implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f235326a;

    @Inject
    public L(@Y61.k Context context) {
        this.f235326a = context;
    }

    @Override // com.avito.android.publish.drafts.K
    public final void a(@Y61.k String str) {
        Context context = this.f235326a;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null).findViewById(R.id.text);
        textView.setText(str);
        Toast toast = new Toast(context);
        toast.setDuration(1);
        toast.setView(textView);
        toast.show();
    }
}
