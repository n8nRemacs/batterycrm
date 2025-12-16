package com.avito.android.crm_paid_cvs.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import com.avito.android.remote.model.TypedResult;
import dt.InterfaceC39801a;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import sP.InterfaceC48087a;

/* compiled from: FavoritesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/domain/a;", "Ldt/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC39801a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC48087a f130291a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDateFormat f130292b;

    /* compiled from: FavoritesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.domain.FavoritesInteractor", f = "FavoritesInteractor.kt", i = {}, l = {36}, m = "getCvsList", n = {}, s = {})
    /* renamed from: com.avito.android.crm_paid_cvs.domain.a$a, reason: collision with other inner class name */
    public static final class C3874a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130293q;

        /* renamed from: s, reason: collision with root package name */
        public int f130295s;

        public C3874a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f130293q = obj;
            this.f130295s |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.c(null, null, this);
        }
    }

    /* compiled from: FavoritesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.domain.FavoritesInteractor", f = "FavoritesInteractor.kt", i = {0}, l = {53}, m = "getFiltersList", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f130296q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f130297r;

        /* renamed from: t, reason: collision with root package name */
        public int f130299t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f130297r = obj;
            this.f130299t |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.e(this);
        }
    }

    @Inject
    public a(@k InterfaceC48087a interfaceC48087a) {
        this.f130291a = interfaceC48087a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f130292b = simpleDateFormat;
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object a(@k Continuation<? super TypedResult<List<SearchItem>>> continuation) {
        return new TypedResult.Success(C42784z0.f406748b);
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object b() {
        return C42784z0.f406748b;
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
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.domain.a.c(java.util.List, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object d(@k String str, @k CvStatus cvStatus, @k String str2, @k Continuation<? super TypedResult<CvItem>> continuation) {
        return new TypedResult.Success(null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.domain.a.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
