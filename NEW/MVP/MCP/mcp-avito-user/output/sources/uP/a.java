package UP;

import Y61.k;
import com.avito.android.job.cv_info_actualization.mvi.domain.CvActualizationInfoBlockType;
import com.avito.android.job.cv_info_actualization.mvi.mapper.items.e;
import com.avito.android.job.cv_info_actualization.mvi.mapper.items.g;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvInfoActualizationItemsProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUP/a;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.android.job.cv_info_actualization.ui.items.loading.c> f16370a = Collections.singletonList(new com.avito.android.job.cv_info_actualization.ui.items.loading.c(null, 1, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.android.job.cv_info_actualization.ui.items.error.c> f16371b = Collections.singletonList(new com.avito.android.job.cv_info_actualization.ui.items.error.c(0, null, null, null, null, 31, null));

    /* compiled from: JsxCvInfoActualizationItemsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UP.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1123a {
        static {
            int[] iArr = new int[CvActualizationInfoBlockType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CvActualizationInfoBlockType cvActualizationInfoBlockType = CvActualizationInfoBlockType.f174120b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CvActualizationInfoBlockType cvActualizationInfoBlockType2 = CvActualizationInfoBlockType.f174120b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@k com.avito.android.job.cv_info_actualization.mvi.mapper.items.a aVar, @k com.avito.android.job.cv_info_actualization.mvi.mapper.items.c cVar, @k e eVar, @k g gVar) {
    }
}
