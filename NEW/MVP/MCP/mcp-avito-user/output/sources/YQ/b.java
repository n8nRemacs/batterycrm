package YQ;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.language_selector.presentation.LanguageSelectorActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LanguageSelectorIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYQ/b;", "LYQ/a;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f19470a;

    @Inject
    public b(@k Context context) {
        this.f19470a = context;
    }

    @Override // YQ.a
    @k
    public final Intent a() {
        return new Intent(this.f19470a, (Class<?>) LanguageSelectorActivity.class);
    }
}
