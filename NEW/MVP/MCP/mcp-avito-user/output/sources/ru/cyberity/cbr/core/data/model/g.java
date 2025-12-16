package ru.cyberity.cbr.core.data.model;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.h;

/* compiled from: Applicant.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0004 #35B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\u0006\u0010\u0005\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0015\u0010 \u001a\u00020&2\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b \u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b1\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b2\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\b \u0010IR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\bK\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u00100\u001a\u0004\bQ\u0010)R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u00100\u001a\u0004\bW\u0010)R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u00100\u001a\u0004\bY\u0010)R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148F¢\u0006\u0006\u001a\u0004\b\\\u0010UR\u0013\u0010_\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b^\u0010)R\u0011\u0010c\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bg\u0010eR\u0011\u0010j\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bi\u0010eR\u0011\u0010l\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bk\u0010e¨\u0006m"}, d2 = {"Lru/cyberity/cbr/core/data/model/g;", "", "", "id", "applicantId", "type", "clientId", "createdAt", "inspectionId", "Lru/cyberity/cbr/core/data/model/g$c;", "requiredIdDocs", "externalUserId", "Lru/cyberity/cbr/core/data/model/b;", "agreement", "Lru/cyberity/cbr/core/data/model/g$d;", AvatarStatus.REVIEW, "env", "Lru/cyberity/cbr/core/data/model/g$a;", RequestReviewResultKt.INFO_TYPE, "lang", "", "Lru/cyberity/cbr/core/data/model/g$b;", "metadata", "email", "phone", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaires", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/g$c;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/b;Lru/cyberity/cbr/core/data/model/g$d;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/g$a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lru/cyberity/cbr/core/data/model/DocumentType;", "Lru/cyberity/cbr/core/data/model/g$c$a;", "a", "(Lru/cyberity/cbr/core/data/model/DocumentType;)Lru/cyberity/cbr/core/data/model/g$c$a;", "Lru/cyberity/cbr/core/data/model/r;", "b", "(Lru/cyberity/cbr/core/data/model/DocumentType;)Ljava/util/List;", "doctype", "", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "B", "s", "c", "L", "d", "t", "e", "v", "f", "D", "g", "Lru/cyberity/cbr/core/data/model/g$c;", "I", "()Lru/cyberity/cbr/core/data/model/g$c;", "h", "z", "i", "Lru/cyberity/cbr/core/data/model/b;", "r", "()Lru/cyberity/cbr/core/data/model/b;", "j", "Lru/cyberity/cbr/core/data/model/g$d;", "J", "()Lru/cyberity/cbr/core/data/model/g$d;", "(Lru/cyberity/cbr/core/data/model/g$d;)V", "k", "y", "l", "Lru/cyberity/cbr/core/data/model/g$a;", "C", "()Lru/cyberity/cbr/core/data/model/g$a;", "m", "E", "n", "Ljava/util/List;", "F", "()Ljava/util/List;", "o", "x", "p", "G", "q", "H", "w", "documents", "u", "country", "Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "K", "()Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "status", "M", "()Z", "isApproved", "O", "isTemporarilyDeclined", "N", "isFinallyRejected", "A", "hasVideoIdentOnly", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String applicantId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String clientId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String createdAt;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String inspectionId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final c requiredIdDocs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String externalUserId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.b agreement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private d review;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String env;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final a info;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String lang;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<b> metadata;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String email;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String phone;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<ru.cyberity.cbr.core.data.source.applicant.remote.r> questionnaires;

    /* compiled from: Applicant.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010\u0015R+\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010\u0015¨\u0006:"}, d2 = {"Lru/cyberity/cbr/core/data/model/g$a;", "", "", "country", "firstName", "lastName", "middleName", "legalName", "gender", "dob", "placeOfBirth", "countryOfBirth", "stateOfBirth", "nationality", "", "", "addresses", "tin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "o", "b", "r", "c", "t", "d", "v", "e", "u", "f", "s", "g", "q", "h", "x", "i", "p", "j", "y", "k", "w", "l", "Ljava/util/List;", "n", "()Ljava/util/List;", "m", "z", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String country;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String firstName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String lastName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String middleName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String legalName;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String gender;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String dob;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String placeOfBirth;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String countryOfBirth;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String stateOfBirth;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String nationality;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<Map<String, String>> addresses;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String tin;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l List<? extends Map<String, String>> list, @Y61.l String str12) {
            this.country = str;
            this.firstName = str2;
            this.lastName = str3;
            this.middleName = str4;
            this.legalName = str5;
            this.gender = str6;
            this.dob = str7;
            this.placeOfBirth = str8;
            this.countryOfBirth = str9;
            this.stateOfBirth = str10;
            this.nationality = str11;
            this.addresses = list;
            this.tin = str12;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.country, aVar.country) && L.f(this.firstName, aVar.firstName) && L.f(this.lastName, aVar.lastName) && L.f(this.middleName, aVar.middleName) && L.f(this.legalName, aVar.legalName) && L.f(this.gender, aVar.gender) && L.f(this.dob, aVar.dob) && L.f(this.placeOfBirth, aVar.placeOfBirth) && L.f(this.countryOfBirth, aVar.countryOfBirth) && L.f(this.stateOfBirth, aVar.stateOfBirth) && L.f(this.nationality, aVar.nationality) && L.f(this.addresses, aVar.addresses) && L.f(this.tin, aVar.tin);
        }

        public int hashCode() {
            String str = this.country;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.firstName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lastName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.middleName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.legalName;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.gender;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.dob;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.placeOfBirth;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.countryOfBirth;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.stateOfBirth;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.nationality;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            List<Map<String, String>> list = this.addresses;
            int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
            String str12 = this.tin;
            return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
        }

        @Y61.l
        public final List<Map<String, String>> n() {
            return this.addresses;
        }

        @Y61.l
        /* renamed from: o, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Y61.l
        /* renamed from: p, reason: from getter */
        public final String getCountryOfBirth() {
            return this.countryOfBirth;
        }

        @Y61.l
        /* renamed from: q, reason: from getter */
        public final String getDob() {
            return this.dob;
        }

        @Y61.l
        /* renamed from: r, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        @Y61.l
        /* renamed from: s, reason: from getter */
        public final String getGender() {
            return this.gender;
        }

        @Y61.l
        /* renamed from: t, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Info(country=");
            sb2.append(this.country);
            sb2.append(", firstName=");
            sb2.append(this.firstName);
            sb2.append(", lastName=");
            sb2.append(this.lastName);
            sb2.append(", middleName=");
            sb2.append(this.middleName);
            sb2.append(", legalName=");
            sb2.append(this.legalName);
            sb2.append(", gender=");
            sb2.append(this.gender);
            sb2.append(", dob=");
            sb2.append(this.dob);
            sb2.append(", placeOfBirth=");
            sb2.append(this.placeOfBirth);
            sb2.append(", countryOfBirth=");
            sb2.append(this.countryOfBirth);
            sb2.append(", stateOfBirth=");
            sb2.append(this.stateOfBirth);
            sb2.append(", nationality=");
            sb2.append(this.nationality);
            sb2.append(", addresses=");
            sb2.append(this.addresses);
            sb2.append(", tin=");
            return C22026a.c(sb2, this.tin, ')');
        }

        @Y61.l
        /* renamed from: u, reason: from getter */
        public final String getLegalName() {
            return this.legalName;
        }

        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getMiddleName() {
            return this.middleName;
        }

        @Y61.l
        /* renamed from: w, reason: from getter */
        public final String getNationality() {
            return this.nationality;
        }

        @Y61.l
        /* renamed from: x, reason: from getter */
        public final String getPlaceOfBirth() {
            return this.placeOfBirth;
        }

        @Y61.l
        /* renamed from: y, reason: from getter */
        public final String getStateOfBirth() {
            return this.stateOfBirth;
        }

        @Y61.l
        /* renamed from: z, reason: from getter */
        public final String getTin() {
            return this.tin;
        }
    }

    /* compiled from: Applicant.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/g$b;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String value;

        public b(@Y61.k String str, @Y61.k String str2) {
            this.key = str;
            this.value = str2;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.key, bVar.key) && L.f(this.value, bVar.value);
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MetaValue(key=");
            sb2.append(this.key);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }
    }

    /* compiled from: Applicant.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010Jn\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u0014¨\u00063"}, d2 = {"Lru/cyberity/cbr/core/data/model/g$d;", "", "", "notificationFailureCnt", "Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "status", "priority", "", "createDate", "Lru/cyberity/cbr/core/data/model/g$d$a;", "result", "", "elapsedSinceQueuedMs", "elapsedSincePendingMs", "levelName", "<init>", "(Ljava/lang/Integer;Lru/cyberity/cbr/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/g$d$a;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "a", "(Ljava/lang/Integer;Lru/cyberity/cbr/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/g$d$a;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/g$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "b", "Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "p", "()Lru/cyberity/cbr/core/data/model/ReviewStatusType;", "c", "n", "d", "Ljava/lang/String;", "i", "e", "Lru/cyberity/cbr/core/data/model/g$d$a;", "o", "()Lru/cyberity/cbr/core/data/model/g$d$a;", "f", "Ljava/lang/Long;", "k", "()Ljava/lang/Long;", "g", "j", "h", "l", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Integer notificationFailureCnt;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ReviewStatusType status;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Integer priority;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String createDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final a result;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Long elapsedSinceQueuedMs;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Long elapsedSincePendingMs;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String levelName;

        /* compiled from: Applicant.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/data/model/g$d$a;", "", "", "moderationComment", "clientComment", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "reviewAnswer", "", "rejectLabels", "Lru/cyberity/cbr/core/data/model/ReviewRejectType;", "reviewRejectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/ReviewRejectType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "f", "c", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "i", "()Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "e", "Lru/cyberity/cbr/core/data/model/ReviewRejectType;", "j", "()Lru/cyberity/cbr/core/data/model/ReviewRejectType;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String moderationComment;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String clientComment;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final ReviewAnswerType reviewAnswer;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final List<String> rejectLabels;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final ReviewRejectType reviewRejectType;

            public a(@Y61.l String str, @Y61.l String str2, @Y61.k ReviewAnswerType reviewAnswerType, @Y61.k List<String> list, @Y61.k ReviewRejectType reviewRejectType) {
                this.moderationComment = str;
                this.clientComment = str2;
                this.reviewAnswer = reviewAnswerType;
                this.rejectLabels = list;
                this.reviewRejectType = reviewRejectType;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return L.f(this.moderationComment, aVar.moderationComment) && L.f(this.clientComment, aVar.clientComment) && this.reviewAnswer == aVar.reviewAnswer && L.f(this.rejectLabels, aVar.rejectLabels) && this.reviewRejectType == aVar.reviewRejectType;
            }

            @Y61.l
            /* renamed from: g, reason: from getter */
            public final String getModerationComment() {
                return this.moderationComment;
            }

            public int hashCode() {
                String str = this.moderationComment;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.clientComment;
                return this.reviewRejectType.hashCode() + H.e((this.reviewAnswer.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.rejectLabels);
            }

            @Y61.k
            /* renamed from: i, reason: from getter */
            public final ReviewAnswerType getReviewAnswer() {
                return this.reviewAnswer;
            }

            @Y61.k
            /* renamed from: j, reason: from getter */
            public final ReviewRejectType getReviewRejectType() {
                return this.reviewRejectType;
            }

            @Y61.k
            public String toString() {
                return "Result(moderationComment=" + this.moderationComment + ", clientComment=" + this.clientComment + ", reviewAnswer=" + this.reviewAnswer + ", rejectLabels=" + this.rejectLabels + ", reviewRejectType=" + this.reviewRejectType + ')';
            }
        }

        public d(@Y61.l Integer num, @Y61.k ReviewStatusType reviewStatusType, @Y61.l Integer num2, @Y61.l String str, @Y61.l a aVar, @Y61.l Long l12, @Y61.l Long l13, @Y61.l String str2) {
            this.notificationFailureCnt = num;
            this.status = reviewStatusType;
            this.priority = num2;
            this.createDate = str;
            this.result = aVar;
            this.elapsedSinceQueuedMs = l12;
            this.elapsedSincePendingMs = l13;
            this.levelName = str2;
        }

        @Y61.k
        public final d a(@Y61.l Integer notificationFailureCnt, @Y61.k ReviewStatusType status, @Y61.l Integer priority, @Y61.l String createDate, @Y61.l a result, @Y61.l Long elapsedSinceQueuedMs, @Y61.l Long elapsedSincePendingMs, @Y61.l String levelName) {
            return new d(notificationFailureCnt, status, priority, createDate, result, elapsedSinceQueuedMs, elapsedSincePendingMs, levelName);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.notificationFailureCnt, dVar.notificationFailureCnt) && this.status == dVar.status && L.f(this.priority, dVar.priority) && L.f(this.createDate, dVar.createDate) && L.f(this.result, dVar.result) && L.f(this.elapsedSinceQueuedMs, dVar.elapsedSinceQueuedMs) && L.f(this.elapsedSincePendingMs, dVar.elapsedSincePendingMs) && L.f(this.levelName, dVar.levelName);
        }

        public int hashCode() {
            Integer num = this.notificationFailureCnt;
            int iHashCode = (this.status.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
            Integer num2 = this.priority;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.createDate;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.result;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Long l12 = this.elapsedSinceQueuedMs;
            int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.elapsedSincePendingMs;
            int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str2 = this.levelName;
            return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: l, reason: from getter */
        public final String getLevelName() {
            return this.levelName;
        }

        @Y61.l
        /* renamed from: o, reason: from getter */
        public final a getResult() {
            return this.result;
        }

        @Y61.k
        /* renamed from: p, reason: from getter */
        public final ReviewStatusType getStatus() {
            return this.status;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Review(notificationFailureCnt=");
            sb2.append(this.notificationFailureCnt);
            sb2.append(", status=");
            sb2.append(this.status);
            sb2.append(", priority=");
            sb2.append(this.priority);
            sb2.append(", createDate=");
            sb2.append(this.createDate);
            sb2.append(", result=");
            sb2.append(this.result);
            sb2.append(", elapsedSinceQueuedMs=");
            sb2.append(this.elapsedSinceQueuedMs);
            sb2.append(", elapsedSincePendingMs=");
            sb2.append(this.elapsedSincePendingMs);
            sb2.append(", levelName=");
            return C22026a.c(sb2, this.levelName, ')');
        }
    }

    public g(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.k c cVar, @Y61.l String str7, @Y61.l ru.cyberity.cbr.core.data.model.b bVar, @Y61.k d dVar, @Y61.l String str8, @Y61.l a aVar, @Y61.l String str9, @Y61.l List<b> list, @Y61.l String str10, @Y61.l String str11, @Y61.l List<ru.cyberity.cbr.core.data.source.applicant.remote.r> list2) {
        this.id = str;
        this.applicantId = str2;
        this.type = str3;
        this.clientId = str4;
        this.createdAt = str5;
        this.inspectionId = str6;
        this.requiredIdDocs = cVar;
        this.externalUserId = str7;
        this.agreement = bVar;
        this.review = dVar;
        this.env = str8;
        this.info = aVar;
        this.lang = str9;
        this.metadata = list;
        this.email = str10;
        this.phone = str11;
        this.questionnaires = list2;
    }

    public final boolean A() {
        List<String> listJ;
        return this.requiredIdDocs.getVideoIdent() && ((listJ = this.requiredIdDocs.j()) == null || listJ.isEmpty());
    }

    @Y61.k
    /* renamed from: B, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: C, reason: from getter */
    public final a getInfo() {
        return this.info;
    }

    @Y61.l
    /* renamed from: E, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Y61.l
    public final List<b> F() {
        return this.metadata;
    }

    @Y61.l
    /* renamed from: G, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Y61.l
    public final List<ru.cyberity.cbr.core.data.source.applicant.remote.r> H() {
        return this.questionnaires;
    }

    @Y61.k
    /* renamed from: I, reason: from getter */
    public final c getRequiredIdDocs() {
        return this.requiredIdDocs;
    }

    @Y61.k
    /* renamed from: J, reason: from getter */
    public final d getReview() {
        return this.review;
    }

    @Y61.k
    public final ReviewStatusType K() {
        return this.review.getStatus();
    }

    public final boolean M() {
        d.a result = this.review.getResult();
        return (result != null ? result.getReviewAnswer() : null) == ReviewAnswerType.Green;
    }

    public final boolean N() {
        d.a result = this.review.getResult();
        if ((result != null ? result.getReviewAnswer() : null) == ReviewAnswerType.Red && this.review.getStatus() == ReviewStatusType.Completed) {
            d.a result2 = this.review.getResult();
            if ((result2 != null ? result2.getReviewRejectType() : null) != ReviewRejectType.Final) {
                d.a result3 = this.review.getResult();
                if ((result3 != null ? result3.getReviewRejectType() : null) == ReviewRejectType.External) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean O() {
        d.a result = this.review.getResult();
        if ((result != null ? result.getReviewAnswer() : null) == ReviewAnswerType.Red && this.review.getStatus() == ReviewStatusType.Completed) {
            d.a result2 = this.review.getResult();
            if ((result2 != null ? result2.getReviewRejectType() : null) == ReviewRejectType.Retry) {
                return true;
            }
        }
        return false;
    }

    public final void a(@Y61.k d dVar) {
        this.review = dVar;
    }

    @Y61.k
    public final List<r> b(@Y61.k DocumentType type) {
        List<String> listQ;
        c.a aVarA = a(type);
        if (aVarA == null || (listQ = aVarA.q()) == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(listQ, 10));
        Iterator<T> it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(r.INSTANCE.a((String) it.next()));
        }
        return arrayList;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return L.f(this.id, gVar.id) && L.f(this.applicantId, gVar.applicantId) && L.f(this.type, gVar.type) && L.f(this.clientId, gVar.clientId) && L.f(this.createdAt, gVar.createdAt) && L.f(this.inspectionId, gVar.inspectionId) && L.f(this.requiredIdDocs, gVar.requiredIdDocs) && L.f(this.externalUserId, gVar.externalUserId) && L.f(this.agreement, gVar.agreement) && L.f(this.review, gVar.review) && L.f(this.env, gVar.env) && L.f(this.info, gVar.info) && L.f(this.lang, gVar.lang) && L.f(this.metadata, gVar.metadata) && L.f(this.email, gVar.email) && L.f(this.phone, gVar.phone) && L.f(this.questionnaires, gVar.questionnaires);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.applicantId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.inspectionId;
        int iHashCode6 = (this.requiredIdDocs.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.externalUserId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ru.cyberity.cbr.core.data.model.b bVar = this.agreement;
        int iHashCode8 = (this.review.hashCode() + ((iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        String str7 = this.env;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        a aVar = this.info;
        int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str8 = this.lang;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<b> list = this.metadata;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.email;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phone;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<ru.cyberity.cbr.core.data.source.applicant.remote.r> list2 = this.questionnaires;
        return iHashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: r, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.b getAgreement() {
        return this.agreement;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Applicant(id=");
        sb2.append(this.id);
        sb2.append(", applicantId=");
        sb2.append(this.applicantId);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", clientId=");
        sb2.append(this.clientId);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", inspectionId=");
        sb2.append(this.inspectionId);
        sb2.append(", requiredIdDocs=");
        sb2.append(this.requiredIdDocs);
        sb2.append(", externalUserId=");
        sb2.append(this.externalUserId);
        sb2.append(", agreement=");
        sb2.append(this.agreement);
        sb2.append(", review=");
        sb2.append(this.review);
        sb2.append(", env=");
        sb2.append(this.env);
        sb2.append(", info=");
        sb2.append(this.info);
        sb2.append(", lang=");
        sb2.append(this.lang);
        sb2.append(", metadata=");
        sb2.append(this.metadata);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", questionnaires=");
        return H.p(sb2, this.questionnaires, ')');
    }

    @Y61.l
    public final String u() {
        a aVar = this.info;
        if (aVar != null) {
            return aVar.getCountry();
        }
        return null;
    }

    @Y61.k
    public final List<DocumentType> w() {
        List<c.a> listG = this.requiredIdDocs.g();
        ArrayList arrayList = new ArrayList(C42745f0.q(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(((c.a) it.next()).getIdDocSetType());
        }
        return arrayList;
    }

    @Y61.l
    /* renamed from: x, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Y61.l
    /* renamed from: z, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @Y61.l
    public final c.a a(@Y61.k DocumentType type) {
        Object next;
        Iterator<T> it = this.requiredIdDocs.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((c.a) next).getIdDocSetType(), type)) {
                break;
            }
        }
        return (c.a) next;
    }

    public final boolean a(@Y61.k String doctype) {
        List<String> listJ;
        return this.requiredIdDocs.getVideoIdent() && ((listJ = this.requiredIdDocs.j()) == null || !listJ.contains(doctype));
    }

    /* compiled from: Applicant.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016Bg\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/cyberity/cbr/core/data/model/g$c;", "", "", "Lru/cyberity/cbr/core/data/model/g$c$a;", "docSets", "", "videoIdent", "", "videoIdentUploadTypes", "stepsOutsideVideoId", "includedCountries", "excludedCountries", "<init>", "(Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Z", "k", "()Z", "c", "l", "d", "j", "e", "i", "f", "h", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<a> docSets;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean videoIdent;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> videoIdentUploadTypes;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> stepsOutsideVideoId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> includedCountries;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> excludedCountries;

        /* compiled from: Applicant.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\u0014R\u0011\u00105\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00107\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b6\u00104R\u0011\u00109\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b8\u00104R\u0011\u0010;\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b:\u00104¨\u0006<"}, d2 = {"Lru/cyberity/cbr/core/data/model/g$c$a;", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "idDocSetType", "", "", "types", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "sides", "videoRequired", "Lru/cyberity/cbr/core/data/model/h$d;", LocalPublishState.FIELDS, "Lru/cyberity/cbr/core/data/model/h$c;", "customField", "questionnaireId", "questionnaireDefId", "captureMode", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/DocumentType;", "m", "()Lru/cyberity/cbr/core/data/model/DocumentType;", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "c", "p", "d", "Ljava/lang/String;", "r", "e", "l", "f", "k", "g", "o", "h", "n", "i", "j", "v", "()Z", "isSelfieWithDocument", "u", "isSelfiePhoto", "s", "isAutocaptureEnabled", "t", "isGEOEnabled", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final DocumentType idDocSetType;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final List<String> types;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final List<IdentitySide> sides;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String videoRequired;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final List<h.d> fields;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final List<h.c> customField;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String questionnaireId;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String questionnaireDefId;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String captureMode;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Y61.k DocumentType documentType, @Y61.k List<String> list, @Y61.k List<? extends IdentitySide> list2, @Y61.l String str, @Y61.l List<h.d> list3, @Y61.l List<h.c> list4, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
                this.idDocSetType = documentType;
                this.types = list;
                this.sides = list2;
                this.videoRequired = str;
                this.fields = list3;
                this.customField = list4;
                this.questionnaireId = str2;
                this.questionnaireDefId = str3;
                this.captureMode = str4;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return L.f(this.idDocSetType, aVar.idDocSetType) && L.f(this.types, aVar.types) && L.f(this.sides, aVar.sides) && L.f(this.videoRequired, aVar.videoRequired) && L.f(this.fields, aVar.fields) && L.f(this.customField, aVar.customField) && L.f(this.questionnaireId, aVar.questionnaireId) && L.f(this.questionnaireDefId, aVar.questionnaireDefId) && L.f(this.captureMode, aVar.captureMode);
            }

            public int hashCode() {
                int iE2 = H.e(H.e(this.idDocSetType.hashCode() * 31, 31, this.types), 31, this.sides);
                String str = this.videoRequired;
                int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
                List<h.d> list = this.fields;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                List<h.c> list2 = this.customField;
                int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str2 = this.questionnaireId;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.questionnaireDefId;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.captureMode;
                return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
            }

            @Y61.l
            public final List<h.c> k() {
                return this.customField;
            }

            @Y61.l
            public final List<h.d> l() {
                return this.fields;
            }

            @Y61.k
            /* renamed from: m, reason: from getter */
            public final DocumentType getIdDocSetType() {
                return this.idDocSetType;
            }

            @Y61.l
            /* renamed from: n, reason: from getter */
            public final String getQuestionnaireDefId() {
                return this.questionnaireDefId;
            }

            @Y61.l
            /* renamed from: o, reason: from getter */
            public final String getQuestionnaireId() {
                return this.questionnaireId;
            }

            @Y61.k
            public final List<String> q() {
                return this.types;
            }

            @Y61.l
            /* renamed from: r, reason: from getter */
            public final String getVideoRequired() {
                return this.videoRequired;
            }

            public final boolean s() {
                return !L.f(this.captureMode != null ? r0.toLowerCase(Locale.ROOT) : null, "manualonly");
            }

            public final boolean t() {
                String str = this.captureMode;
                return L.f(str != null ? str.toLowerCase(Locale.ROOT) : null, "manualandauto");
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("DocSetsItem(idDocSetType=");
                sb2.append(this.idDocSetType);
                sb2.append(", types=");
                sb2.append(this.types);
                sb2.append(", sides=");
                sb2.append(this.sides);
                sb2.append(", videoRequired=");
                sb2.append(this.videoRequired);
                sb2.append(", fields=");
                sb2.append(this.fields);
                sb2.append(", customField=");
                sb2.append(this.customField);
                sb2.append(", questionnaireId=");
                sb2.append(this.questionnaireId);
                sb2.append(", questionnaireDefId=");
                sb2.append(this.questionnaireDefId);
                sb2.append(", captureMode=");
                return C22026a.c(sb2, this.captureMode, ')');
            }

            public final boolean u() {
                return this.idDocSetType.k() && L.f(this.videoRequired, VideoRequiredType.PhotoRequired.getValue());
            }

            public final boolean v() {
                return this.idDocSetType.k() && L.f(this.videoRequired, VideoRequiredType.Disabled.getValue());
            }
        }

        public c(@Y61.k List<a> list, boolean z12, @Y61.l List<String> list2, @Y61.l List<String> list3, @Y61.l List<String> list4, @Y61.l List<String> list5) {
            this.docSets = list;
            this.videoIdent = z12;
            this.videoIdentUploadTypes = list2;
            this.stepsOutsideVideoId = list3;
            this.includedCountries = list4;
            this.excludedCountries = list5;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.docSets, cVar.docSets) && this.videoIdent == cVar.videoIdent && L.f(this.videoIdentUploadTypes, cVar.videoIdentUploadTypes) && L.f(this.stepsOutsideVideoId, cVar.stepsOutsideVideoId) && L.f(this.includedCountries, cVar.includedCountries) && L.f(this.excludedCountries, cVar.excludedCountries);
        }

        @Y61.k
        public final List<a> g() {
            return this.docSets;
        }

        @Y61.l
        public final List<String> h() {
            return this.excludedCountries;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.docSets.hashCode() * 31;
            boolean z12 = this.videoIdent;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode + i12) * 31;
            List<String> list = this.videoIdentUploadTypes;
            int iHashCode2 = (i13 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.stepsOutsideVideoId;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.includedCountries;
            int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.excludedCountries;
            return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
        }

        @Y61.l
        public final List<String> i() {
            return this.includedCountries;
        }

        @Y61.l
        public final List<String> j() {
            return this.stepsOutsideVideoId;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getVideoIdent() {
            return this.videoIdent;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RequiredIdDocs(docSets=");
            sb2.append(this.docSets);
            sb2.append(", videoIdent=");
            sb2.append(this.videoIdent);
            sb2.append(", videoIdentUploadTypes=");
            sb2.append(this.videoIdentUploadTypes);
            sb2.append(", stepsOutsideVideoId=");
            sb2.append(this.stepsOutsideVideoId);
            sb2.append(", includedCountries=");
            sb2.append(this.includedCountries);
            sb2.append(", excludedCountries=");
            return H.p(sb2, this.excludedCountries, ')');
        }

        public /* synthetic */ c(List list, boolean z12, List list2, List list3, List list4, List list5, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? null : list3, (i12 & 16) != 0 ? null : list4, (i12 & 32) != 0 ? null : list5);
        }
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, String str5, String str6, c cVar, String str7, ru.cyberity.cbr.core.data.model.b bVar, d dVar, String str8, a aVar, String str9, List list, String str10, String str11, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3, str4, str5, str6, cVar, str7, (i12 & 256) != 0 ? null : bVar, dVar, str8, aVar, str9, list, str10, str11, list2);
    }
}
