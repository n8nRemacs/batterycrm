package uA;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExtendedProfileConstructorProfileDataApiV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LuA/a;", "", "a", "b", "LuA/a$a;", "LuA/a$b;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC48870a {

    /* compiled from: ExtendedProfileConstructorProfileDataApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LuA/a$a;", "LuA/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uA.a$a, reason: collision with other inner class name */
    public static final class C12705a implements InterfaceC48870a {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public C12705a(@k String str) {
            this.message = str;
        }
    }

    /* compiled from: ExtendedProfileConstructorProfileDataApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LuA/a$b;", "LuA/a;", "LuA/b;", "profileInputNameSettings", "", "LuA/d;", "verticals", "<init>", "(LuA/b;Ljava/util/List;)V", "LuA/b;", "getProfileInputNameSettings", "()LuA/b;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uA.a$b */
    public static final class b implements InterfaceC48870a {

        @com.google.gson.annotations.c("profileInputNameSettings")
        @l
        private final uA.b profileInputNameSettings;

        @com.google.gson.annotations.c("verticals")
        @l
        private final List<d> verticals;

        public b(@l uA.b bVar, @l List<d> list) {
            this.profileInputNameSettings = bVar;
            this.verticals = list;
        }

        @l
        public final List<d> a() {
            return this.verticals;
        }
    }
}
