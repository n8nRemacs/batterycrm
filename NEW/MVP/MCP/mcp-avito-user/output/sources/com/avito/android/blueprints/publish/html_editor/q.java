package com.avito.android.blueprints.publish.html_editor;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.M0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HtmlEditorViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/q;", "Landroidx/lifecycle/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.b f106299d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final hJ.g f106300e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final hJ.h f106301f;

    @Inject
    public q(@Y61.k com.avito.android.html_editor.b bVar, @Y61.k hJ.g gVar, @Y61.k hJ.h hVar, @Y61.k Fragment fragment) {
        super(fragment, null);
        this.f106299d = bVar;
        this.f106300e = gVar;
        this.f106301f = hVar;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(s.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new s(c23060r0, this.f106299d, this.f106300e, this.f106301f);
    }
}
