package De;

import Ce.InterfaceC13293a;
import Ce.InterfaceC13294b;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.auto_evidence_request.di.n;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerContract.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"LDe/a;", "Li/a;", "LCe/b$d;", "LCe/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: De.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13389a extends AbstractC41201a<InterfaceC13294b.d, InterfaceC13293a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhotoPickerIntentFactory f3307b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3308c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f3309d = "";

    /* renamed from: e, reason: collision with root package name */
    @k
    public String f3310e = "";

    @Inject
    public C13389a(@k PhotoPickerIntentFactory photoPickerIntentFactory, @n @k String str) {
        this.f3307b = photoPickerIntentFactory;
        this.f3308c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, InterfaceC13294b.d dVar) {
        InterfaceC13294b.d dVar2 = dVar;
        this.f3309d = dVar2.f2521a;
        this.f3310e = dVar2.f2524d;
        PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, 0 == true ? 1 : 0);
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f3307b;
        String str = this.f3308c;
        boolean z12 = dVar2.f2523c;
        return PhotoPickerIntentFactory.a.a(photoPickerIntentFactory, context, str, "auto evidence files", z12 ? 1 : 0, dVar2.f2522b, null, null, modeAdd, false, 352);
    }

    @Override // i.AbstractC41201a
    public final InterfaceC13293a parseResult(int i12, Intent intent) {
        if (i12 != -1) {
            return null;
        }
        return new InterfaceC13293a.f(this.f3309d, intent != null ? intent.getData() : null, this.f3310e);
    }
}
