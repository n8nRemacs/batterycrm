package com.avito.android.edit_basic_info;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import javax.inject.Inject;
import jb0.InterfaceC42346a;
import kotlin.G0;
import kotlin.Metadata;
import ky.InterfaceC43512a;

/* compiled from: EditBasicInfoAvatarPickerRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/c;", "Lcom/avito/android/edit_basic_info/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f146035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f146036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC43512a, G0> f146037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f146038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f146039e;

    @Inject
    public c(@Y61.k Y41.l lVar, @Y61.k Fragment fragment, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory, @Y61.k @InterfaceC42346a String str) {
        this.f146035a = fragment;
        this.f146036b = photoPickerIntentFactory;
        this.f146037c = lVar;
        this.f146038d = str;
        this.f146039e = fragment.registerForActivityResult(new b(this), new L91.o(this, 18));
    }

    @Override // com.avito.android.edit_basic_info.a
    public final void a() {
        this.f146039e.b(G0.f406611a);
    }
}
