package com.avito.android.upload_doc.helpers;

import Y61.k;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.upload_doc.helpers.h;
import com.avito.android.upload_doc.lifecycle.GigUploadDocFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigUploadDocPhotoPicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/helpers/c;", "", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final GigUploadDocFragment f306792a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhotoPickerIntentFactory f306793b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final androidx.view.result.h<h.a> f306794c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public N f306795d = a.f306790l;

    public c(@k GigUploadDocFragment gigUploadDocFragment, @k PhotoPickerIntentFactory photoPickerIntentFactory) {
        this.f306792a = gigUploadDocFragment;
        this.f306793b = photoPickerIntentFactory;
        this.f306794c = gigUploadDocFragment.registerForActivityResult(new b(this), new C28629h(0));
    }
}
