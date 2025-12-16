package com.avito.android.serp.adapter.alert_banner;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.alert_banner.AlertBannerWidget;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AlertBannerItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/alert_banner/c;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: AlertBannerItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f268909a;

        static {
            int[] iArr = new int[AlertBannerWidget.Style.values().length];
            try {
                iArr[AlertBannerWidget.Style.DANGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertBannerWidget.Style.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertBannerWidget.Style.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlertBannerWidget.Style.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AlertBannerWidget.Style.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AlertBannerWidget.Style.WHITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f268909a = iArr;
        }
    }

    @Inject
    public c() {
    }
}
