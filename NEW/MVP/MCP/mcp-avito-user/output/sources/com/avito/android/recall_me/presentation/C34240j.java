package com.avito.android.recall_me.presentation;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecallMeResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/j;", "", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.recall_me.presentation.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34240j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f252007a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f252008b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f252009c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f252010d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f252011e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f252012f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f252013g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f252014h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f252015i;

    @Inject
    public C34240j(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f252007a = resources;
        this.f252008b = resources.getString(R.string.recall_me_name_title);
        this.f252009c = resources.getString(R.string.recall_me_phone_title);
        resources.getString(R.string.recall_me_time_title);
        this.f252010d = resources.getString(R.string.recall_me_phone_prefix);
        this.f252011e = resources.getString(R.string.recall_me_accept_button_text);
        this.f252012f = resources.getString(R.string.recall_me_agreement_text);
        this.f252013g = resources.getString(R.string.recall_me_agreement_linked_text);
        this.f252014h = resources.getString(R.string.recall_me_default_loading_error);
        this.f252015i = resources.getString(R.string.recall_me_success_text);
    }
}
