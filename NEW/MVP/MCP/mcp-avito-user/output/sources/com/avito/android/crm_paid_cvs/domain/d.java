package com.avito.android.crm_paid_cvs.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import com.avito.android.job.crm_paid_cvs_public.generated.api.api_paid_cv_get_cvs.ApiPaidCvItemStatus;
import com.avito.android.remote.model.TypedResult;
import dt.InterfaceC39801a;
import ht.C40981c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import sP.InterfaceC48087a;

/* compiled from: PaidCvsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/domain/d;", "Ldt/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements InterfaceC39801a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC48087a f130301a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDateFormat f130302b;

    /* compiled from: PaidCvsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ApiPaidCvItemStatus.Value> f130303a = kotlin.enums.c.a(ApiPaidCvItemStatus.Value.values());
    }

    /* compiled from: PaidCvsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.domain.PaidCvsInteractor", f = "PaidCvsInteractor.kt", i = {}, l = {77}, m = "changeResponseStatus", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130304q;

        /* renamed from: s, reason: collision with root package name */
        public int f130306s;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f130304q = obj;
            this.f130306s |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.d(null, null, null, this);
        }
    }

    /* compiled from: PaidCvsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.domain.PaidCvsInteractor", f = "PaidCvsInteractor.kt", i = {}, l = {37}, m = "getCvsList", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130307q;

        /* renamed from: s, reason: collision with root package name */
        public int f130309s;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f130307q = obj;
            this.f130309s |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.c(null, null, this);
        }
    }

    /* compiled from: PaidCvsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.domain.PaidCvsInteractor", f = "PaidCvsInteractor.kt", i = {0}, l = {51}, m = "getFiltersList", n = {"this"}, s = {"L$0"})
    /* renamed from: com.avito.android.crm_paid_cvs.domain.d$d, reason: collision with other inner class name */
    public static final class C3875d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public d f130310q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f130311r;

        /* renamed from: t, reason: collision with root package name */
        public int f130313t;

        public C3875d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f130311r = obj;
            this.f130313t |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.e(this);
        }
    }

    @Inject
    public d(@k InterfaceC48087a interfaceC48087a) {
        this.f130301a = interfaceC48087a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f130302b = simpleDateFormat;
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object a(@k Continuation<? super TypedResult<List<SearchItem>>> continuation) {
        return new TypedResult.Success(C42784z0.f406748b);
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object b() {
        List list = a.f130303a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = ((AbstractC42738c) list).iterator();
        while (it.hasNext()) {
            arrayList.add(C40981c.b(((ApiPaidCvItemStatus.Value) it.next()).f174020b));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // dt.InterfaceC39801a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.util.List<com.avito.android.crm_paid_cvs.dto.FilterItem> r33, @Y61.l java.lang.Long r34, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<kotlin.Q<java.lang.Long, java.util.List<com.avito.android.crm_paid_cvs.dto.CvItem>>>> r35) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.domain.d.c(java.util.List, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.avito.android.crm_paid_cvs.dto.CvItem] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // dt.InterfaceC39801a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r28, @Y61.k com.avito.android.crm_paid_cvs.dto.CvStatus r29, @Y61.k java.lang.String r30, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<com.avito.android.crm_paid_cvs.dto.CvItem>> r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.domain.d.d(java.lang.String, com.avito.android.crm_paid_cvs.dto.CvStatus, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // dt.InterfaceC39801a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<java.util.List<com.avito.android.crm_paid_cvs.dto.FilterItem>>> r28) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.domain.d.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
