package com.avito.android.publish.details;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsResourceProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/m1;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.m1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C33771m1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f234834a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f234835b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f234836c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f234837d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f234838e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f234839f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f234840g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f234841h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f234842i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f234843j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f234844k = "support.avito.ru";

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f234845l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f234846m;

    @Inject
    public C33771m1(@Y61.k Resources resources) {
        this.f234834a = resources;
        this.f234835b = resources.getString(R.string.cancel);
        this.f234836c = resources.getString(R.string.network_unavailable_snack);
        this.f234837d = resources.getString(R.string.image_upload_is_not_finished);
        this.f234838e = resources.getString(R.string.has_finish_on_flow_warnings);
        this.f234839f = resources.getString(R.string.write_no_car_text);
        this.f234840g = resources.getString(R.string.write_no_car_button_positive);
        this.f234841h = resources.getString(R.string.video_loading_error);
        this.f234842i = resources.getString(R.string.historical_suggests_title);
        this.f234843j = resources.getString(R.string.upload_video_upload_error);
        this.f234845l = resources.getString(R.string.publish_general_button_continue);
        this.f234846m = resources.getString(R.string.category_title);
    }

    @Y61.k
    public final String a(@Y61.l String str) {
        Resources resources = this.f234834a;
        return (str == null || str.length() == 0) ? resources.getString(R.string.fix_errors) : resources.getString(R.string.fix_errors_with_error_id, str);
    }
}
