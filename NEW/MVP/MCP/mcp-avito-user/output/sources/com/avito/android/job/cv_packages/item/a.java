package com.avito.android.job.cv_packages.item;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PackageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/item/a;", "", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f174391a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f174392b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f174393c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f174394d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f174395e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f174396f;

    public a(@l String str, @l DeepLink deepLink, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f174391a = str;
        this.f174392b = deepLink;
        this.f174393c = str2;
        this.f174394d = str3;
        this.f174395e = str4;
        this.f174396f = str5;
    }

    public /* synthetic */ a(String str, DeepLink deepLink, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(str, deepLink, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5);
    }
}
