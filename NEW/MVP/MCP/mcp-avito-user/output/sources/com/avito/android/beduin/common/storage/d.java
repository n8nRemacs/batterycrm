package com.avito.android.beduin.common.storage;

import com.avito.android.beduin_shared.model.action.storeParameters.StorageType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ni.InterfaceC44429b;

/* compiled from: BeduinParametersStorageProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/storage/d;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<c> f103479a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<c> f103480b;

    /* compiled from: BeduinParametersStorageProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103481a;

        static {
            int[] iArr = new int[StorageType.values().length];
            try {
                iArr[StorageType.TEMPORARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StorageType.PERSISTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103481a = iArr;
        }
    }

    @Inject
    public d(@Y61.k @InterfaceC44429b h31.e<c> eVar, @Y61.k @InterfaceC44429b h31.e<c> eVar2) {
        this.f103479a = eVar;
        this.f103480b = eVar2;
    }

    @Y61.k
    public final c a(@Y61.l StorageType storageType) {
        int i12 = storageType == null ? -1 : a.f103481a[storageType.ordinal()];
        if (i12 == -1 || i12 == 1) {
            return this.f103479a.get();
        }
        if (i12 == 2) {
            return this.f103480b.get();
        }
        throw new NoWhenBranchMatchedException();
    }
}
