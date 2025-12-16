package com.avito.android.publish.items.file_uploader;

import Y41.p;
import android.view.View;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import kotlin.jvm.internal.H;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f236816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FileUploadParameterValue f236817d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(p pVar, FileUploadParameterValue fileUploadParameterValue, int i12) {
        this.f236815b = i12;
        this.f236816c = (H) pVar;
        this.f236817d = fileUploadParameterValue;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Y41.p, kotlin.jvm.internal.H] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r32 = this.f236816c;
        FileUploadParameterValue fileUploadParameterValue = this.f236817d;
        switch (this.f236815b) {
            case 0:
                int i12 = l.f236820i;
                r32.invoke(fileUploadParameterValue.getId(), Boolean.valueOf(fileUploadParameterValue.isUploaded()));
                break;
            default:
                int i13 = com.avito.android.publish.slots.cpa_ddu_upload.l.f243362g;
                r32.invoke(fileUploadParameterValue.getId(), Boolean.valueOf(fileUploadParameterValue.isUploaded()));
                break;
        }
    }
}
