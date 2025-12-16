package h91;

import android.net.Uri;
import android.os.Parcelable;
import c91.C26963B;
import c91.C26964C;
import c91.C26966E;
import c91.C26968G;
import c91.C26970a;
import c91.C26971b;
import c91.C26973d;
import c91.C26974e;
import c91.C26975f;
import c91.C26976g;
import c91.C26977h;
import c91.C26978i;
import c91.C26979j;
import c91.C26980k;
import c91.C26981l;
import c91.C26985p;
import c91.C26992x;
import c91.C26993y;
import c91.I;
import c91.J;
import c91.K;
import c91.M;
import c91.O;
import c91.Q;
import c91.S;
import c91.T;
import c91.U;
import c91.V;
import c91.W;
import c91.X;
import c91.Y;
import c91.Z;
import c91.a0;
import c91.b0;
import c91.c0;
import c91.e0;
import c91.i0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.remote.model.messenger.context_actions.ContextAction;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.ItemsRequest;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.body.CallReference;
import ru.avito.messenger.api.entity.body.ImageReference;
import ru.avito.messenger.api.entity.body.ItemReference;
import ru.avito.messenger.api.entity.body.Text;
import ru.avito.messenger.api.entity.body.Unknown;
import ru.avito.messenger.generated.api.get_channels.Action;
import ru.avito.messenger.generated.api.get_channels.ActionHandler;
import ru.avito.messenger.generated.api.get_channels.Attribute;
import ru.avito.messenger.generated.api.get_channels.BaseItemAction;
import ru.avito.messenger.generated.api.get_channels.CallItemAction;
import ru.avito.messenger.generated.api.get_channels.CallbackItemAction;
import ru.avito.messenger.generated.api.get_channels.Channel;
import ru.avito.messenger.generated.api.get_channels.ChannelContextActionsNullable;
import ru.avito.messenger.generated.api.get_channels.Chunk;
import ru.avito.messenger.generated.api.get_channels.ItemTextField;
import ru.avito.messenger.generated.api.get_channels.MenuElement;
import ru.avito.messenger.generated.api.get_channels.Message;
import ru.avito.messenger.generated.api.get_channels.MessageBodyAppCallNullable;
import ru.avito.messenger.generated.api.get_channels.MessageBodyCompositeNullable;
import ru.avito.messenger.generated.api.get_channels.MessageContextActionsNullable;
import ru.avito.messenger.generated.api.get_channels.Preview;

/* compiled from: GetChannelsApicoResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh91/f;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h91.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40790f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f397045a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f397046b;

    /* compiled from: GetChannelsApicoResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h91.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f397047a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f397048b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f397049c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f397050d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f397051e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f397052f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f397053g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f397054h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f397055i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f397056j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f397057k;

        static {
            int[] iArr = new int[Channel.Type.values().length];
            try {
                iArr[Channel.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Channel.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Channel.Type.Int4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Channel.Type.Int0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f397047a = iArr;
            int[] iArr2 = new int[Message.Type.values().length];
            try {
                iArr2[Message.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Message.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Message.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Message.Type.Int4.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Message.Type.Int5.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Message.Type.Int6.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Message.Type.Int7.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Message.Type.Int8.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Message.Type.Int9.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Message.Type.Int10.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Message.Type.Int11.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[Message.Type.Int12.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[Message.Type.Int13.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[Message.Type.Int14.ordinal()] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[Message.Type.Int0.ordinal()] = 15;
            } catch (NoSuchFieldError unused20) {
            }
            f397048b = iArr2;
            int[] iArr3 = new int[Chunk.Type.values().length];
            try {
                iArr3[Chunk.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[Chunk.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[Chunk.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[Chunk.Type.Int6.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Chunk.Type.Int8.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[Chunk.Type.Int9.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[Chunk.Type.Int0.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[Chunk.Type.Int12.ordinal()] = 8;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[Chunk.Type.Int13.ordinal()] = 9;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[Chunk.Type.Int5.ordinal()] = 10;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[Chunk.Type.Int4.ordinal()] = 11;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[Chunk.Type.Int7.ordinal()] = 12;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[Chunk.Type.Int10.ordinal()] = 13;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[Chunk.Type.Int11.ordinal()] = 14;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[Chunk.Type.Int14.ordinal()] = 15;
            } catch (NoSuchFieldError unused35) {
            }
            f397049c = iArr3;
            int[] iArr4 = new int[ItemTextField.Type.values().length];
            try {
                iArr4[ItemTextField.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[ItemTextField.Type.Geo.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[ItemTextField.Type.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            f397050d = iArr4;
            int[] iArr5 = new int[MessageBodyAppCallNullable.Direction.values().length];
            try {
                iArr5[MessageBodyAppCallNullable.Direction.f431002In.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[MessageBodyAppCallNullable.Direction.Out.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[MessageBodyAppCallNullable.Direction.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            f397051e = iArr5;
            int[] iArr6 = new int[MessageBodyAppCallNullable.Status.values().length];
            try {
                iArr6[MessageBodyAppCallNullable.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Missed.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Rejected.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.RejectedByNoMicAccess.ordinal()] = 5;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Busy.ordinal()] = 6;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.NotDelivered.ordinal()] = 7;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused49) {
            }
            f397052f = iArr6;
            int[] iArr7 = new int[MessageContextActionsNullable.Type.values().length];
            try {
                iArr7[MessageContextActionsNullable.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[MessageContextActionsNullable.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[MessageContextActionsNullable.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            f397053g = iArr7;
            int[] iArr8 = new int[Preview.Type.values().length];
            try {
                iArr8[Preview.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[Preview.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr8[Preview.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            f397054h = iArr8;
            int[] iArr9 = new int[Action.Type.values().length];
            try {
                iArr9[Action.Type.Int0.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr9[Action.Type.Int1.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            f397055i = iArr9;
            int[] iArr10 = new int[ActionHandler.Type.values().length];
            try {
                iArr10[ActionHandler.Type.Int0.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr10[ActionHandler.Type.Int1.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            f397056j = iArr10;
            int[] iArr11 = new int[ChannelContextActionsNullable.Type.values().length];
            try {
                iArr11[ChannelContextActionsNullable.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr11[ChannelContextActionsNullable.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr11[ChannelContextActionsNullable.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused62) {
            }
            f397057k = iArr11;
        }
    }

    public C40790f(@Y61.k x xVar, @Y61.k Gson gson) {
        this.f397045a = xVar;
        this.f397046b = gson;
    }

    public static k a(Chunk chunk, Message message) {
        return new k("GetChannelsApicoResponseConverter ApiMessageBody apicoMessage.type = " + message.getType() + ". Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Chunk type = " + chunk.getType() + ". Required body is null");
    }

    public static k b(Message message) {
        return new k("GetChannelsApicoResponseConverter ApiMessageBody apicoMessage.type = " + message.getType() + ". Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Required body is null");
    }

    public static k c(Message message, String str) {
        return new k("GetChannelsApicoResponseConverter Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Required property " + str + " is missing");
    }

    public static AttachMenu e(C26977h c26977h) {
        C26973d file = c26977h.getFile();
        AttachMenuItem.File file2 = file != null ? new AttachMenuItem.File(file.getTitle(), file.getMaxSizeBytes(), file.getEnableForUnanswered(), file.b()) : null;
        C26974e image = c26977h.getImage();
        AttachMenuItem.Image image2 = image != null ? new AttachMenuItem.Image(image.getTitle(), image.getEnableForUnanswered()) : null;
        C26980k video = c26977h.getVideo();
        AttachMenuItem.Video video2 = video != null ? new AttachMenuItem.Video(video.getTitle(), video.getEnableForUnanswered(), video.getMaxSizeBytes(), video.getMaxDurationSec()) : null;
        C26975f item = c26977h.getItem();
        AttachMenuItem.Item item2 = item != null ? new AttachMenuItem.Item(item.getTitle()) : null;
        C26976g location = c26977h.getLocation();
        AttachMenuItem.Location location2 = location != null ? new AttachMenuItem.Location(location.getTitle(), location.getEnableForUnanswered()) : null;
        C26978i replies = c26977h.getReplies();
        AttachMenuItem.Replies replies2 = replies != null ? new AttachMenuItem.Replies(replies.getTitle()) : null;
        C26981l voice = c26977h.getVoice();
        AttachMenuItem.Voice voice2 = voice != null ? new AttachMenuItem.Voice(voice.getTitle(), voice.getEnableForUnanswered()) : null;
        C26979j support = c26977h.getSupport();
        return new AttachMenu(file2, image2, video2, item2, location2, replies2, voice2, support != null ? new AttachMenuItem.Support(support.getTitle(), support.getEnableForUnanswered(), support.getMessage()) : null);
    }

    @Y61.k
    public static Image k(@Y61.k com.avito.android.remote.model.Image image) {
        Map<Size, Uri> variants = image.getVariants();
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
        Iterator<T> it = variants.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Size size = (Size) entry.getKey();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(size.getWidth());
            sb2.append('x');
            sb2.append(size.getHeight());
            linkedHashMap.put(sb2.toString(), entry.getValue());
        }
        return new Image(linkedHashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m(@Y61.k java.util.List r3) {
        /*
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            switch(r2) {
                case 112: goto L88;
                case 115: goto L7c;
                case 96882: goto L70;
                case 101072: goto L64;
                case 104396: goto L58;
                case 104916: goto L4c;
                case 104919: goto L40;
                case 104921: goto L34;
                case 2141246174: goto L26;
                default: goto L24;
            }
        L24:
            goto L90
        L26:
            java.lang.String r2 = "transaction"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L30
            goto L90
        L30:
            r1 = 8
            goto L95
        L34:
            java.lang.String r2 = "j_n"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3d
            goto L90
        L3d:
            r1 = 11
            goto L95
        L40:
            java.lang.String r2 = "j_l"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            goto L90
        L49:
            r1 = 10
            goto L95
        L4c:
            java.lang.String r2 = "j_i"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L55
            goto L90
        L55:
            r1 = 13
            goto L95
        L58:
            java.lang.String r2 = "imp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L61
            goto L90
        L61:
            r1 = 16
            goto L95
        L64:
            java.lang.String r2 = "f_i"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6d
            goto L90
        L6d:
            r1 = 1
            goto L95
        L70:
            java.lang.String r2 = "asd"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L79
            goto L90
        L79:
            r1 = 7
            goto L95
        L7c:
            java.lang.String r2 = "s"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L85
            goto L90
        L85:
            r1 = 2
            goto L95
        L88:
            java.lang.String r2 = "p"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L93
        L90:
            r1 = 0
            goto L95
        L93:
            r1 = 3
        L95:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L11
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h91.C40790f.m(java.util.List):java.util.ArrayList");
    }

    public static List n(List list) {
        if (list == null) {
            return C42784z0.f406748b;
        }
        List<MenuElement> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (MenuElement menuElement : list2) {
            String title = menuElement.getTitle();
            DeepLink deepLink = menuElement.getDeepLink();
            String str = menuElement.getIcon().f430996b;
            Q confirmation = menuElement.getConfirmation();
            arrayList.add(new ChannelMenuAction(title, deepLink, str, confirmation != null ? new ActionConfirmation(confirmation.getTitle(), confirmation.getDescription(), confirmation.getOk(), confirmation.getCancel()) : null, menuElement.getRawDeeplink()));
        }
        return arrayList;
    }

    public static void p(String str) {
        V2.f318762a.j("GetChannelsApicoResponseConverter", "", new l("Unsupported type in ".concat(str)));
    }

    @Y61.k
    public final PlatformSupport d(@Y61.k e0 e0Var) {
        ArrayList arrayList;
        List<Integer> listB = e0Var.b();
        AttributedText attributedTextJ = null;
        if (listB != null) {
            arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                String str = iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? null : "android" : "ios" : "mav" : "web";
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        Z fallback = e0Var.getFallback();
        if (fallback != null) {
            AttributedText attributedText = fallback.getAttributedText();
            attributedTextJ = attributedText == null ? j(fallback.getText(), fallback.b()) : attributedText;
        }
        return new PlatformSupport(arrayList, attributedTextJ);
    }

    public final ContextAction f(Action action) throws k {
        String str;
        ContextActionHandler link;
        int i12 = a.f397055i[action.getType().ordinal()];
        if (i12 == 1) {
            str = "primary";
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "secondary";
        }
        String str2 = str;
        String text = action.getText();
        ActionHandler handler = action.getHandler();
        int i13 = a.f397056j[handler.getType().ordinal()];
        if (i13 == 1) {
            M valueLink = handler.getValueLink();
            if (valueLink == null) {
                throw new k("valueLink is null for ActionHandler.LINK");
            }
            link = new ContextActionHandler.Link(valueLink.getUrl(), valueLink.getRawDeeplink());
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c0 valueMethodCall = handler.getValueMethodCall();
            if (valueMethodCall == null) {
                throw new k("valueMethodCall is null for ActionHandler.METHOD_CALL");
            }
            link = o(valueMethodCall);
        }
        C26970a confirmation = action.getConfirmation();
        return new ContextAction(text, str2, link, confirmation != null ? new ActionConfirmation(confirmation.getTitle(), confirmation.getDescription(), confirmation.getConfirmText(), confirmation.getCancelText()) : null, action.getAnalytics());
    }

    public final PlatformActions.ExpandableData g(C26992x c26992x) {
        String titleShort = c26992x.getTitleShort();
        c0 cancelAction = c26992x.getCancelAction();
        return new PlatformActions.ExpandableData(titleShort, cancelAction != null ? o(cancelAction) : null);
    }

    @Y61.l
    public final PlatformActions h(@Y61.k MessageContextActionsNullable messageContextActionsNullable, @Y61.k Message message) throws k {
        int i12 = a.f397053g[messageContextActionsNullable.getType().ordinal()];
        if (i12 == 1) {
            C26971b actions = messageContextActionsNullable.getActions();
            if (actions == null) {
                return null;
            }
            String title = actions.getTitle();
            List<Action> listA = actions.a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(f((Action) it.next()));
            }
            String messageId = messageContextActionsNullable.getMessageId();
            e0 platformSupport = message.getPlatformSupport();
            PlatformSupport platformSupportD = platformSupport != null ? d(platformSupport) : null;
            Long lValueOf = Long.valueOf(messageContextActionsNullable.getVersion());
            C26992x expandable = actions.getExpandable();
            PlatformActions.ExpandableData expandableDataG = expandable != null ? g(expandable) : null;
            Boolean hideKeyboard = actions.getHideKeyboard();
            return new PlatformActions.Actions(title, arrayList, messageId, platformSupportD, lValueOf, expandableDataG, hideKeyboard != null ? hideKeyboard.booleanValue() : false, L.f(actions.getUseMultiButtons(), Boolean.TRUE) ? PlatformActions.MultiButtonsData.INSTANCE : null);
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            p("ApicoMessageContextActions.type");
            return new PlatformActions.None(Long.valueOf(messageContextActionsNullable.getVersion()));
        }
        K itemsList = messageContextActionsNullable.getItemsList();
        if (itemsList == null) {
            throw c(message, "apicoMessageContextActions.itemsList");
        }
        C26992x expandable2 = itemsList.getExpandable();
        if ((expandable2 != null ? g(expandable2) : null) == null) {
            return new PlatformActions.None(Long.valueOf(messageContextActionsNullable.getVersion()));
        }
        String title2 = itemsList.getTitle();
        c0 itemsRequest = itemsList.getItemsRequest();
        if (itemsRequest == null) {
            throw c(message, PlatformActions.ItemsList.ITEMS_REQUEST);
        }
        String method = itemsRequest.getMethod();
        Map<String, Object> mapB = itemsRequest.b();
        ItemsRequest itemsRequest2 = new ItemsRequest(method, mapB != null ? new RawJson(this.f397046b.l(mapB)) : null);
        String messageId2 = messageContextActionsNullable.getMessageId();
        e0 platformSupport2 = message.getPlatformSupport();
        PlatformSupport platformSupportD2 = platformSupport2 != null ? d(platformSupport2) : null;
        Long lValueOf2 = Long.valueOf(messageContextActionsNullable.getVersion());
        PlatformActions.ExpandableData expandableDataG2 = g(itemsList.getExpandable());
        Boolean hideKeyboard2 = itemsList.getHideKeyboard();
        return new PlatformActions.ItemsList(title2, itemsRequest2, messageId2, platformSupportD2, lValueOf2, expandableDataG2, hideKeyboard2 != null ? hideKeyboard2.booleanValue() : false);
    }

    @Y61.k
    public final MessageBody.SystemMessageBody.Platform.Bubble i(@Y61.k Chunk chunk, @Y61.k Message message) throws k, l {
        com.avito.android.remote.model.Image image;
        String str;
        MessageBody.SystemMessageBody.Platform.ItemExtended itemExtended;
        MessageBody.SystemMessageBody.ExtendedActions extendedActions;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton2;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton3;
        String str2;
        Iterator it;
        com.avito.android.remote.model.Image image2;
        String str3;
        Parcelable text;
        ArrayList arrayList;
        MessageBody.SystemMessageBody.Platform.Bubble image3;
        ArrayList arrayList2;
        AttributedText attributedTextJ;
        String text2;
        MarkersRequest markersRequest = null;
        switch (a.f397049c[chunk.getType().ordinal()]) {
            case 1:
                Z text3 = chunk.getText();
                if (text3 != null) {
                    return new MessageBody.SystemMessageBody.Platform.Bubble.Text(j(text3.getText(), text3.b()));
                }
                throw a(chunk, message);
            case 2:
                W item = chunk.getItem();
                if (item == null) {
                    throw a(chunk, message);
                }
                String strValueOf = String.valueOf(item.getItemId());
                String title = item.getTitle();
                if (title == null) {
                    throw c(message, "title");
                }
                String priceString = item.getPriceString();
                if (priceString == null) {
                    throw c(message, "priceString");
                }
                String oldPriceString = item.getOldPriceString();
                String locationWithMetro = item.getLocationWithMetro();
                com.avito.android.remote.model.Image imageBySizes = item.getImageBySizes();
                String uriPath = item.getUriPath();
                if (uriPath == null) {
                    throw c(message, MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH);
                }
                I extended = item.getExtended();
                if (extended != null) {
                    AttributedText price = extended.getPrice();
                    List<C26963B> listB = extended.b();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, 10));
                    for (C26963B c26963b : listB) {
                        arrayList3.add(new UniversalImage(c26963b.getValue(), c26963b.getValueDark()));
                    }
                    List<ItemTextField> listD = extended.d();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = listD.iterator();
                    while (it2.hasNext()) {
                        ItemTextField itemTextField = (ItemTextField) it2.next();
                        int i12 = a.f397050d[itemTextField.getType().ordinal()];
                        if (i12 == 1) {
                            it = it2;
                            image2 = imageBySizes;
                            str3 = uriPath;
                            String str4 = itemTextField.getType().f430992b;
                            AttributedText attributedText = itemTextField.getContent().getAttributedText();
                            if (attributedText == null) {
                                attributedText = new AttributedText("Ошибка", C42784z0.f406748b, 0, 4, null);
                            }
                            text = new MessageBody.SystemMessageBody.ExtendedTextFields.Text(str4, attributedText);
                        } else if (i12 == 2) {
                            J content = itemTextField.getContent();
                            String distance = content.getDistance();
                            String distanceInTime = content.getDistanceInTime();
                            List<c91.L> listE = content.e();
                            if (listE != null) {
                                List<c91.L> list = listE;
                                it = it2;
                                image2 = imageBySizes;
                                str3 = uriPath;
                                ArrayList arrayList5 = new ArrayList(C42745f0.q(list, 10));
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add(new MessageBody.SystemMessageBody.ExtendedColor(((c91.L) it3.next()).getColor()));
                                }
                                arrayList = arrayList5;
                            } else {
                                it = it2;
                                image2 = imageBySizes;
                                str3 = uriPath;
                                arrayList = null;
                            }
                            text = new MessageBody.SystemMessageBody.ExtendedTextFields.Content(itemTextField.getType().f430992b, new MessageBody.SystemMessageBody.ExtendedContent(distance, distanceInTime, arrayList, content.getName(), content.getAddress()));
                        } else {
                            if (i12 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p("ApicoItemTextField.type");
                            it = it2;
                            image2 = imageBySizes;
                            str3 = uriPath;
                            text = null;
                        }
                        if (text != null) {
                            arrayList4.add(text);
                        }
                        it2 = it;
                        imageBySizes = image2;
                        uriPath = str3;
                    }
                    image = imageBySizes;
                    str = uriPath;
                    C26968G actions = extended.getActions();
                    if (actions != null) {
                        CallbackItemAction callback = actions.getCallback();
                        x xVar = this.f397045a;
                        if (callback != null) {
                            String title2 = callback.getTitle();
                            CallbackItemAction.Style style = callback.getStyle();
                            extendedButton = new MessageBody.SystemMessageBody.ExtendedButton(title2, style != null ? style.f430964b : null, callback.getUri(), xVar.b(callback.getUri()));
                        } else {
                            extendedButton = null;
                        }
                        BaseItemAction message2 = actions.getMessage();
                        if (message2 != null) {
                            String title3 = message2.getTitle();
                            BaseItemAction.Style style2 = message2.getStyle();
                            if (style2 == null || (str2 = style2.f430945b) == null) {
                                str2 = "accentSmall";
                            }
                            extendedButton2 = new MessageBody.SystemMessageBody.ExtendedButton(title3, str2, message2.getUri(), xVar.b(message2.getUri()));
                        } else {
                            extendedButton2 = null;
                        }
                        CallItemAction call = actions.getCall();
                        if (call != null) {
                            String title4 = call.getTitle();
                            CallItemAction.Style style3 = call.getStyle();
                            extendedButton3 = new MessageBody.SystemMessageBody.ExtendedButton(title4, style3 != null ? style3.f430954b : null, call.getUri(), xVar.b(call.getUri()));
                        } else {
                            extendedButton3 = null;
                        }
                        extendedActions = new MessageBody.SystemMessageBody.ExtendedActions(extendedButton, extendedButton2, extendedButton3);
                    } else {
                        extendedActions = null;
                    }
                    itemExtended = new MessageBody.SystemMessageBody.Platform.ItemExtended(price, arrayList3, arrayList4, extendedActions);
                } else {
                    image = imageBySizes;
                    str = uriPath;
                    itemExtended = null;
                }
                return new MessageBody.SystemMessageBody.Platform.Bubble.Item(strValueOf, title, priceString, oldPriceString, locationWithMetro, image, str, itemExtended);
            case 3:
                V image4 = chunk.getImage();
                if (image4 == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.Image(image4.getImageId(), null);
                break;
            case 4:
                Y location = chunk.getLocation();
                if (location == null) {
                    throw a(chunk, message);
                }
                String title5 = location.getTitle();
                if (title5 == null) {
                    throw c(message, "title");
                }
                List<C26993y> listA = location.a();
                ArrayList arrayList6 = new ArrayList(C42745f0.q(listA, 10));
                for (C26993y c26993y : listA) {
                    String title6 = c26993y.getTitle();
                    List<Z> listA2 = c26993y.a();
                    if (listA2 != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Z z12 : listA2) {
                            if (z12 == null || (attributedTextJ = z12.getAttributedText()) == null) {
                                attributedTextJ = (z12 == null || (text2 = z12.getText()) == null) ? null : j(text2, z12.b());
                            }
                            if (attributedTextJ != null) {
                                arrayList7.add(attributedTextJ);
                            }
                        }
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList6.add(new GeoMarker(c26993y.getLat(), c26993y.getLon(), title6, arrayList2));
                }
                GeoMarker[] geoMarkerArr = (GeoMarker[]) arrayList6.toArray(new GeoMarker[0]);
                c0 markersRequest2 = location.getMarkersRequest();
                if (markersRequest2 != null) {
                    String method = markersRequest2.getMethod();
                    Map<String, Object> mapB = markersRequest2.b();
                    markersRequest = new MarkersRequest(method, mapB != null ? new RawJson(this.f397046b.l(mapB)) : RawJson.INSTANCE.getEMPTY());
                }
                return new MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation(title5, geoMarkerArr, markersRequest);
            case 5:
                U file = chunk.getFile();
                if (file == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.File(file.getFileId(), file.getName(), file.getSizeBytes());
                break;
            case 6:
                a0 video = chunk.getVideo();
                if (video == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.Video(video.getVideoId());
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new l("Unsupported type in ApicoChunk.type - Platform message chunk type " + chunk.getType());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return image3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.avito.android.remote.model.text.LinkAttribute] */
    @Y61.k
    public final AttributedText j(@Y61.k String str, @Y61.l Map map) {
        ?? arrayList;
        String title;
        if (map != null) {
            arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Attribute attribute = (Attribute) entry.getValue();
                DeepLinkAttribute linkAttribute = null;
                if (attribute.getValue() != null && attribute.getType() == Attribute.Type.Int0 && (title = attribute.getValue().getTitle()) != null) {
                    String url = attribute.getValue().getUrl();
                    String deepLink = attribute.getValue().getDeepLink();
                    DeepLink deepLinkB = deepLink != null ? this.f397045a.b(deepLink) : null;
                    if (deepLinkB != null && !(deepLinkB instanceof NoMatchLink)) {
                        linkAttribute = new DeepLinkAttribute(str2, title, deepLinkB, url, deepLink, null);
                    } else if (url != null) {
                        linkAttribute = new LinkAttribute(str2, title, url, null);
                    }
                }
                if (linkAttribute != null) {
                    arrayList.add(linkAttribute);
                }
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return new AttributedText(str, arrayList, 0);
    }

    @Y61.k
    public final ru.avito.messenger.api.entity.body.MessageBody l(@Y61.k S s5, @Y61.k Message message) throws k {
        ru.avito.messenger.api.entity.body.MessageBody link;
        MessageBody.Link.Preview snippet;
        MessageBody.AppCall.Direction unsupported;
        MessageBody.AppCall.Status unsupported2;
        MessageBody.Link.Preview preview = null;
        preview = null;
        switch (a.f397048b[message.getType().ordinal()]) {
            case 1:
                Z text = s5.getText();
                if (text != null) {
                    return (message.getDeletedAt() == null || message.getDeletedAt().longValue() <= 0) ? new Text(text.getText(), s5.getIdempotencyKey(), text.getHasTrustedUrls(), text.getAttributedText()) : new MessageBody.Deleted(text.getText(), s5.getIdempotencyKey());
                }
                throw b(message);
            case 2:
                W item = s5.getItem();
                if (item != null) {
                    return new ItemReference(String.valueOf(item.getItemId()), s5.getIdempotencyKey());
                }
                throw b(message);
            case 3:
                V image = s5.getImage();
                if (image != null) {
                    return new ImageReference(image.getImageId(), s5.getIdempotencyKey());
                }
                throw b(message);
            case 4:
                T call = s5.getCall();
                if (call != null) {
                    return new CallReference(call.getTargetUserId(), s5.getIdempotencyKey());
                }
                throw b(message);
            case 5:
                X link2 = s5.getLink();
                if (link2 == null) {
                    throw b(message);
                }
                String url = link2.getUrl();
                Preview preview2 = link2.getPreview();
                if (preview2 != null) {
                    Preview.Type type = preview2.getType();
                    int i12 = type == null ? -1 : a.f397054h[type.ordinal()];
                    if (i12 == -1) {
                        throw c(message, "ApicoPreview.type");
                    }
                    if (i12 == 1) {
                        O linkPreview = preview2.getLinkPreview();
                        if (linkPreview == null) {
                            throw c(message, "linkPreview");
                        }
                        snippet = new MessageBody.Link.Preview.Snippet(linkPreview.getUrl(), null, linkPreview.getDomain(), linkPreview.getTrusted(), linkPreview.getTitle(), linkPreview.getSubtitle(), linkPreview.getDescription(), linkPreview.getImageId(), null, null, null, null);
                    } else if (i12 == 2) {
                        C26964C imagePreview = preview2.getImagePreview();
                        if (imagePreview == null) {
                            throw c(message, "imagePreview");
                        }
                        snippet = new MessageBody.Link.Preview.Image(imagePreview.getUrl(), imagePreview.getDomain(), imagePreview.getTrusted(), imagePreview.getImageId(), null, null, null, null);
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        p("ApicoPreview.type");
                    }
                    preview = snippet;
                }
                link = new MessageBody.Link(url, preview, s5.getIdempotencyKey(), link2.getIsTrusted());
                break;
            case 6:
                Y location = s5.getLocation();
                if (location == null) {
                    throw b(message);
                }
                C26993y c26993y = (C26993y) C42745f0.G(location.a());
                if (c26993y == null) {
                    throw c(message, "latitude");
                }
                double lat = c26993y.getLat();
                C26993y c26993y2 = (C26993y) C42745f0.G(location.a());
                if (c26993y2 == null) {
                    throw c(message, "longitude");
                }
                double lon = c26993y2.getLon();
                String title = location.getTitle();
                if (title == null) {
                    throw c(message, "title");
                }
                C26993y c26993y3 = (C26993y) C42745f0.G(location.a());
                link = new MessageBody.Location(lat, lon, title, c26993y3 != null ? c26993y3.getKind() : null, s5.getIdempotencyKey());
                break;
            case 7:
                MessageBodyAppCallNullable appCall = s5.getAppCall();
                if (appCall == null) {
                    throw b(message);
                }
                String text2 = appCall.getText();
                C26985p call2 = appCall.getCall();
                if (call2 == null) {
                    throw c(message, "call");
                }
                com.avito.android.remote.model.Action action = new com.avito.android.remote.model.Action(call2.getTitle(), this.f397045a.b(call2.getUri()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
                String callId = appCall.getCallId();
                Long duration = appCall.getDuration();
                int i13 = a.f397051e[appCall.getDirection().ordinal()];
                if (i13 == 1) {
                    unsupported = MessageBody.AppCall.Direction.Incoming.INSTANCE;
                } else if (i13 == 2) {
                    unsupported = MessageBody.AppCall.Direction.Outgoing.INSTANCE;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    unsupported = new MessageBody.AppCall.Direction.Unsupported("none");
                }
                MessageBody.AppCall.Direction direction = unsupported;
                switch (a.f397052f[appCall.getStatus().ordinal()]) {
                    case 1:
                        unsupported2 = MessageBody.AppCall.Status.Success.INSTANCE;
                        break;
                    case 2:
                        unsupported2 = MessageBody.AppCall.Status.Missed.INSTANCE;
                        break;
                    case 3:
                        unsupported2 = MessageBody.AppCall.Status.Canceled.INSTANCE;
                        break;
                    case 4:
                        unsupported2 = MessageBody.AppCall.Status.Rejected.INSTANCE;
                        break;
                    case 5:
                        unsupported2 = MessageBody.AppCall.Status.Rejected.INSTANCE;
                        break;
                    case 6:
                        unsupported2 = MessageBody.AppCall.Status.Busy.INSTANCE;
                        break;
                    case 7:
                        unsupported2 = MessageBody.AppCall.Status.NotDelivered.INSTANCE;
                        break;
                    case 8:
                        unsupported2 = new MessageBody.AppCall.Status.Unsupported("unknown_type");
                        p("ApicoAppCallStatus");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new MessageBody.AppCall(text2, action, callId, duration, direction, unsupported2, appCall.getTitle(), appCall.getSubTitle(), appCall.getIsVideo(), s5.getIdempotencyKey());
            case 8:
                U file = s5.getFile();
                if (file != null) {
                    return new MessageBody.File(file.getFileId(), file.getName(), file.getSizeBytes(), null, s5.getIdempotencyKey());
                }
                throw b(message);
            case 9:
                a0 video = s5.getVideo();
                if (video != null) {
                    return new MessageBody.Video(video.getFileId(), video.getVideoId(), s5.getIdempotencyKey());
                }
                throw b(message);
            case 10:
                MessageBodyCompositeNullable composite = s5.getComposite();
                if (composite == null) {
                    throw b(message);
                }
                String text3 = composite.getText();
                try {
                    List<Chunk> listA = composite.a();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(i((Chunk) it.next(), message));
                    }
                    MessageContextActionsNullable contextActions = message.getContextActions();
                    PlatformActions platformActionsH = contextActions != null ? h(contextActions, message) : null;
                    String flowName = composite.getFlowName();
                    C26966E inputState = message.getInputState();
                    return new MessageBody.SystemMessageBody.Platform.FromAvito(arrayList, platformActionsH, flowName, text3, inputState != null ? new InputState(inputState.getIsDisabled(), inputState.getReason(), inputState.getDescription()) : null);
                } catch (Throwable th2) {
                    V2.f318762a.a("GetChannelsApicoResponseConverter", "Failed to convert ApicoAvitoPlatformMessageBody", th2);
                    return !C43066x.K(text3) ? new MessageBody.SystemMessageBody.Platform.FromAvito(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(composite.getText(), C42784z0.f406748b, 0, 4, null))), null, null, null, null, 30, null) : new Unknown(MessageBody.SystemMessageBody.Platform.FromAvito.TYPE, s5.getIdempotencyKey());
                }
            case 11:
                MessageBodyCompositeNullable composite2 = s5.getComposite();
                if (composite2 == null) {
                    throw b(message);
                }
                String text4 = composite2.getText();
                try {
                    List<Chunk> listA2 = composite2.a();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listA2, 10));
                    Iterator<T> it2 = listA2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(i((Chunk) it2.next(), message));
                    }
                    MessageContextActionsNullable contextActions2 = message.getContextActions();
                    PlatformActions platformActionsH2 = contextActions2 != null ? h(contextActions2, message) : null;
                    String flowName2 = composite2.getFlowName();
                    C26966E inputState2 = message.getInputState();
                    return new MessageBody.SystemMessageBody.Platform.FromUser(arrayList2, platformActionsH2, flowName2, text4, inputState2 != null ? new InputState(inputState2.getIsDisabled(), inputState2.getReason(), inputState2.getDescription()) : null);
                } catch (Throwable th3) {
                    V2.f318762a.a("GetChannelsApicoResponseConverter", "Failed to convert ApicoImpersonatedPlatformMessageBody", th3);
                    return !C43066x.K(text4) ? new MessageBody.SystemMessageBody.Platform.FromUser(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(composite2.getText(), C42784z0.f406748b, 0, 4, null))), null, null, null, null, 30, null) : new Unknown(MessageBody.SystemMessageBody.Platform.FromUser.TYPE, s5.getIdempotencyKey());
                }
            case 12:
                Z text5 = s5.getText();
                if (text5 != null) {
                    return new MessageBody.Text.Reaction(text5.getText(), null, s5.getIdempotencyKey(), text5.getAttributedText(), 2, null);
                }
                throw b(message);
            case 13:
                Z text6 = s5.getText();
                if (text6 != null) {
                    return new MessageBody.Deleted(text6.getText(), s5.getIdempotencyKey());
                }
                throw b(message);
            case 14:
                b0 voice = s5.getVoice();
                if (voice != null) {
                    return new MessageBody.Voice(voice.getVoiceId(), s5.getIdempotencyKey());
                }
                throw b(message);
            case 15:
                p("ApicoMessage.type");
                return new Unknown("unknown_type", s5.getIdempotencyKey());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return link;
    }

    @Y61.k
    public final ContextActionHandler.MethodCall o(@Y61.k c0 c0Var) {
        String method = c0Var.getMethod();
        Map<String, Object> mapB = c0Var.b();
        RawJson rawJson = mapB != null ? new RawJson(this.f397046b.l(mapB)) : null;
        i0 reaction = c0Var.getReaction();
        return new ContextActionHandler.MethodCall(method, rawJson, reaction != null ? new ContextActionHandler.MethodCall.Reaction(reaction.getText()) : null);
    }
}
