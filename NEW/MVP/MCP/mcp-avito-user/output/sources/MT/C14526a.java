package Mt;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.cv_upload.screens.cv_picker.CvPickerActivity;
import com.avito.android.cv_upload.screens.cv_picker.CvPickerParams;
import com.avito.android.cv_upload.screens.cv_upload.CvUploadActivity;
import com.avito.android.cv_upload.screens.cv_upload.CvUploadParams;
import com.avito.android.deeplink.JobCvUploadLink;
import com.squareup.anvil.annotations.ContributesBinding;
import hO.InterfaceC40860a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvUploadIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMt/a;", "LhO/a;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14526a implements InterfaceC40860a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f11043a;

    @Inject
    public C14526a(@k Context context) {
        this.f11043a = context;
    }

    @Override // hO.InterfaceC40860a
    @k
    public final Intent a(@k Uri uri, @k String str) {
        CvUploadActivity.a aVar = CvUploadActivity.f131700q;
        CvUploadParams cvUploadParams = new CvUploadParams(uri, str);
        aVar.getClass();
        return new Intent(this.f11043a, (Class<?>) CvUploadActivity.class).putExtra("cv_upload_params", cvUploadParams).setFlags(536870912);
    }

    @Override // hO.InterfaceC40860a
    @k
    public final Intent b(@k JobCvUploadLink jobCvUploadLink) {
        CvPickerActivity.a aVar = CvPickerActivity.f131687p;
        CvPickerParams cvPickerParams = new CvPickerParams(jobCvUploadLink);
        aVar.getClass();
        return new Intent(this.f11043a, (Class<?>) CvPickerActivity.class).putExtra("open_params", cvPickerParams);
    }
}
