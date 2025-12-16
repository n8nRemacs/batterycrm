package i40;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiOauthInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li40/a;", "", "", "projectId", "projectName", "", "Li40/b;", "scopes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getProjectId", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C41222a {

    @c("projectId")
    @k
    private final String projectId;

    @c("projectName")
    @l
    private final String projectName;

    @c("scopes")
    @l
    private final List<C41223b> scopes;

    public C41222a(@k String str, @l String str2, @l List<C41223b> list) {
        this.projectId = str;
        this.projectName = str2;
        this.scopes = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getProjectName() {
        return this.projectName;
    }

    @l
    public final List<C41223b> b() {
        return this.scopes;
    }
}
