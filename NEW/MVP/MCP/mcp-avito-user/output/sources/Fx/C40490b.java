package fx;

import androidx.compose.runtime.internal.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api3NdTrxSearchParamsGetResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b*\u0010\"¨\u0006+"}, d2 = {"Lfx/b;", "", "", "", "Lfx/c;", "alias", "delimiters", "", "developments", "", "Lfx/d;", "extraButtons", "icon", "inline", "lowerCase", "radio", "room", "Lfx/m;", "tip", "type", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lfx/m;Ljava/lang/String;)V", "Ljava/util/Map;", "getAlias", "()Ljava/util/Map;", "getDelimiters", "Ljava/lang/Boolean;", "getDevelopments", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getExtraButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "getInline", "getLowerCase", "getRadio", "getRoom", "Lfx/m;", "getTip", "()Lfx/m;", "getType", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40490b {

    @com.google.gson.annotations.c("alias")
    @Y61.l
    private final Map<String, C40491c> alias;

    @com.google.gson.annotations.c("delimiters")
    @Y61.l
    private final Map<String, String> delimiters;

    @com.google.gson.annotations.c("developments")
    @Y61.l
    private final Boolean developments;

    @com.google.gson.annotations.c("extraButtons")
    @Y61.l
    private final List<C40492d> extraButtons;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c("inline")
    @Y61.l
    private final Boolean inline;

    @com.google.gson.annotations.c("lowerCase")
    @Y61.l
    private final Boolean lowerCase;

    @com.google.gson.annotations.c("radio")
    @Y61.l
    private final Boolean radio;

    @com.google.gson.annotations.c("room")
    @Y61.l
    private final Boolean room;

    @com.google.gson.annotations.c("tip")
    @Y61.l
    private final m tip;

    @com.google.gson.annotations.c("type")
    @Y61.l
    private final String type;

    public C40490b(@Y61.l Map<String, C40491c> map, @Y61.l Map<String, String> map2, @Y61.l Boolean bool, @Y61.l List<C40492d> list, @Y61.l String str, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l Boolean bool4, @Y61.l Boolean bool5, @Y61.l m mVar, @Y61.l String str2) {
        this.alias = map;
        this.delimiters = map2;
        this.developments = bool;
        this.extraButtons = list;
        this.icon = str;
        this.inline = bool2;
        this.lowerCase = bool3;
        this.radio = bool4;
        this.room = bool5;
        this.tip = mVar;
        this.type = str2;
    }
}
