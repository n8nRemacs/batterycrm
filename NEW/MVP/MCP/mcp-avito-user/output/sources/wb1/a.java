package Wb1;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import mc1.C44053a;
import mc1.C44054b;

@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"LWb1/a;", "", "", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getUrl$annotations", "()V", "t0/a", "t0/b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
@w
/* loaded from: classes9.dex */
public final class a {

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    static {
        new C44054b();
    }

    @InterfaceC42830m
    public a(int i12, @v String str, P0 p02) {
        if (1 == (i12 & 1)) {
            this.url = str;
        } else {
            C44053a.f414640a.getClass();
            E0.b(i12, 1, C44053a.f414641b);
            throw null;
        }
    }

    public a(@k String str) {
        this.url = str;
    }
}
