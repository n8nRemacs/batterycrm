package rD0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import qD0.C47283a;

/* compiled from: ConfigureCategoryResult.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LrD0/b;", "", "", "title", "", "LrD0/a;", "list", "LqD0/a;", "alertInfo", "<init>", "(Ljava/lang/String;Ljava/util/List;LqD0/a;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LqD0/a;", "a", "()LqD0/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47528b {

    @c("alertInfo")
    @k
    private final C47283a alertInfo;

    @c("list")
    @k
    private final List<C47527a> list;

    @c("title")
    @k
    private final String title;

    public C47528b(@k String str, @k List<C47527a> list, @k C47283a c47283a) {
        this.title = str;
        this.list = list;
        this.alertInfo = c47283a;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C47283a getAlertInfo() {
        return this.alertInfo;
    }

    @k
    public final List<C47527a> b() {
        return this.list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
