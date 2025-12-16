package Hx0;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.stories.view.i;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.b;
import kotlin.Metadata;

/* compiled from: StoriesTitleItemViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHx0/a;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/stories/view/i;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14046a extends b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f7842b;

    public C14046a(@k View view) {
        super(view);
        this.f7842b = (TextView) view.findViewById(R.id.stories_title_item);
    }

    @Override // com.avito.android.stories.view.i
    public final void HV(@l String str) {
        I5.a(this.f7842b, str, false);
    }
}
