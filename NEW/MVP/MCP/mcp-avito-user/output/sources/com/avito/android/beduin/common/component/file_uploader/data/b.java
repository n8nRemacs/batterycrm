package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.account.E;
import com.avito.android.beduin.common.component.file_uploader.ApiConfiguration;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FileUploaderApiWrapper.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/data/b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.beduin.common.component.file_uploader.data.a> f101235a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f101236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f101237c;

    /* compiled from: FileUploaderApiWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101238a;

        static {
            int[] iArr = new int[ApiConfiguration.HttpMethod.values().length];
            try {
                iArr[ApiConfiguration.HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiConfiguration.HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiConfiguration.HttpMethod.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiConfiguration.HttpMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f101238a = iArr;
        }
    }

    @Inject
    public b(@Y61.k h31.e<com.avito.android.beduin.common.component.file_uploader.data.a> eVar, @Y61.k E e12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f101235a = eVar;
        this.f101236b = e12;
        this.f101237c = interfaceC35745a5;
    }
}
