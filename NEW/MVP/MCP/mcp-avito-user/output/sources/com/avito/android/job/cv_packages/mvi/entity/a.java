package com.avito.android.job.cv_packages.mvi.entity;

import Y61.k;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvPackageState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/job/cv_packages/mvi/entity/a$a;", "Lcom/avito/android/job/cv_packages/mvi/entity/a$b;", "Lcom/avito/android/job/cv_packages/mvi/entity/a$c;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a extends q {

    /* compiled from: CvPackageState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/a$a;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.job.cv_packages.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C5146a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174459b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f174460c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f174461d;

        public C5146a(@k String str, @k String str2, @k ArrayList arrayList) {
            super(null);
            this.f174459b = str;
            this.f174460c = str2;
            this.f174461d = arrayList;
        }
    }

    /* compiled from: CvPackageState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/a$b;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f174462b;

        public b(@k ApiError apiError) {
            super(null);
            this.f174462b = apiError;
        }
    }

    /* compiled from: CvPackageState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/a$c;", "Lcom/avito/android/job/cv_packages/mvi/entity/a;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f174463b = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
