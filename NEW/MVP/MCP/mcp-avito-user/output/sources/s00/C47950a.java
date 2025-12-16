package s00;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalGetEntryPointPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls00/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", EntryPointParameter.TYPE, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C47950a {

    @c(EntryPointParameter.TYPE)
    @k
    private final DeepLink entryPoint;

    public C47950a(@k DeepLink deepLink) {
        this.entryPoint = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getEntryPoint() {
        return this.entryPoint;
    }
}
